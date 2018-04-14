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
import com.tools20022.repository.codeset.NRATax1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#DomesticIncomeDividend
 * NRATax1Code.DomesticIncomeDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#ForeignIncomeDividends
 * NRATax1Code.ForeignIncomeDividends}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#DividendsDomesticNonTaxable
 * NRATax1Code.DividendsDomesticNonTaxable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#DividendsFullyExempt
 * NRATax1Code.DividendsFullyExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#DividendsFederalTaxableStateExempt
 * NRATax1Code.DividendsFederalTaxableStateExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#ReturnOfCapital
 * NRATax1Code.ReturnOfCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#LongTermCapitalGains
 * NRATax1Code.LongTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#ShortTermCapitalGains
 * NRATax1Code.ShortTermCapitalGains}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATax1Code#FIRPTAEligible
 * NRATax1Code.FIRPTAEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#REITCapitalGainDistributions
 * NRATax1Code.REITCapitalGainDistributions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#LimitedPubliclyTradedPartnership
 * NRATax1Code.LimitedPubliclyTradedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#SubstituteDividendPayment
 * NRATax1Code.SubstituteDividendPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#CapitalGainDistributionShortTermRICs
 * NRATax1Code.CapitalGainDistributionShortTermRICs}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#CorporateActionDividendCapitalGains
 * NRATax1Code.CorporateActionDividendCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#USSourceOrdinaryInterest
 * NRATax1Code.USSourceOrdinaryInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#ForeignBondInterest
 * NRATax1Code.ForeignBondInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#AllStateAndTerritorialMunicipalInterest
 * NRATax1Code.AllStateAndTerritorialMunicipalInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#AllMunicipalBondsSubjectToFederalTax
 * NRATax1Code.AllMunicipalBondsSubjectToFederalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#USGovernmentInterestOnContractsNotesAndMortgages
 * NRATax1Code.USGovernmentInterestOnContractsNotesAndMortgages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#USGovernmentInterestOnGNMA1And2
 * NRATax1Code.USGovernmentInterestOnGNMA1And2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#InterestOnCollatralizedMortgageObligations
 * NRATax1Code.InterestOnCollatralizedMortgageObligations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#InterestOnCertificatesOfDeposit
 * NRATax1Code.InterestOnCertificatesOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#USGovernmentInterest
 * NRATax1Code.USGovernmentInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#USGovernmentInterestOnNotesAndBills
 * NRATax1Code.USGovernmentInterestOnNotesAndBills}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#PrincipalPaydowns
 * NRATax1Code.PrincipalPaydowns}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#ShortTermInterest
 * NRATax1Code.ShortTermInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#USGovernmentInterestLongerThan183Days
 * NRATax1Code.USGovernmentInterestLongerThan183Days}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#InterestSubstitutePayment
 * NRATax1Code.InterestSubstitutePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#OtherSusbtitutePayment
 * NRATax1Code.OtherSusbtitutePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#NRAWithholdingTax
 * NRATax1Code.NRAWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#FederalBackUpDividends
 * NRATax1Code.FederalBackUpDividends}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#FederalBackUpInterest
 * NRATax1Code.FederalBackUpInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#ForeignTaxWithheldAtSourceDividends
 * NRATax1Code.ForeignTaxWithheldAtSourceDividends}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#ForeignTaxWithheldAtSourceInterest
 * NRATax1Code.ForeignTaxWithheldAtSourceInterest}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATax1Code#CustodyIssues
 * NRATax1Code.CustodyIssues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#InterestOnBalances
 * NRATax1Code.InterestOnBalances}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#InterestOnSeriesEOrHBonds
 * NRATax1Code.InterestOnSeriesEOrHBonds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#RoyaltyPayments
 * NRATax1Code.RoyaltyPayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#OtherTaxableIncome
 * NRATax1Code.OtherTaxableIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#OtherNonTaxableIncome
 * NRATax1Code.OtherNonTaxableIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#MiscellaneousPayments
 * NRATax1Code.MiscellaneousPayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#CashInLieuOfFractionalShares
 * NRATax1Code.CashInLieuOfFractionalShares}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATax1Code#StockSplit
 * NRATax1Code.StockSplit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATax1Code#StockDividend
 * NRATax1Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax1Code#CashOnIncreasedShares
 * NRATax1Code.CashOnIncreasedShares}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATax1Code#SpinOff
 * NRATax1Code.SpinOff}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NRATaxCode NRATaxCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NRATax1Code"</li>
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
public class NRATax1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticIncomeDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code DomesticIncomeDividend = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticIncomeDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.DomesticIncomeDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignIncomeDividends"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code ForeignIncomeDividends = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignIncomeDividends";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.ForeignIncomeDividends.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsDomesticNonTaxable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code DividendsDomesticNonTaxable = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendsDomesticNonTaxable";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.DividendsDomesticNonTaxable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsFullyExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code DividendsFullyExempt = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendsFullyExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.DividendsFullyExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsFederalTaxableStateExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code DividendsFederalTaxableStateExempt = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendsFederalTaxableStateExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.DividendsFederalTaxableStateExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOfCapital"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code ReturnOfCapital = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOfCapital";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.ReturnOfCapital.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGains"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code LongTermCapitalGains = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.LongTermCapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGains"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code ShortTermCapitalGains = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.ShortTermCapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FIRPTAEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code FIRPTAEligible = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FIRPTAEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.FIRPTAEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "REITCapitalGainDistributions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code REITCapitalGainDistributions = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "REITCapitalGainDistributions";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.REITCapitalGainDistributions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPubliclyTradedPartnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code LimitedPubliclyTradedPartnership = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPubliclyTradedPartnership";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.LimitedPubliclyTradedPartnership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstituteDividendPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code SubstituteDividendPayment = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstituteDividendPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.SubstituteDividendPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainDistributionShortTermRICs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code CapitalGainDistributionShortTermRICs = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainDistributionShortTermRICs";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.CapitalGainDistributionShortTermRICs.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDividendCapitalGains"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code CorporateActionDividendCapitalGains = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDividendCapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.CorporateActionDividendCapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USSourceOrdinaryInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code USSourceOrdinaryInterest = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USSourceOrdinaryInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.USSourceOrdinaryInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignBondInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code ForeignBondInterest = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignBondInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.ForeignBondInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllStateAndTerritorialMunicipalInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code AllStateAndTerritorialMunicipalInterest = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllStateAndTerritorialMunicipalInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.AllStateAndTerritorialMunicipalInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllMunicipalBondsSubjectToFederalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code AllMunicipalBondsSubjectToFederalTax = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllMunicipalBondsSubjectToFederalTax";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.AllMunicipalBondsSubjectToFederalTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterestOnContractsNotesAndMortgages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code USGovernmentInterestOnContractsNotesAndMortgages = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterestOnContractsNotesAndMortgages";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.USGovernmentInterestOnContractsNotesAndMortgages.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterestOnGNMA1And2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code USGovernmentInterestOnGNMA1And2 = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterestOnGNMA1And2";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.USGovernmentInterestOnGNMA1And2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOnCollatralizedMortgageObligations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code InterestOnCollatralizedMortgageObligations = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOnCollatralizedMortgageObligations";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.InterestOnCollatralizedMortgageObligations.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOnCertificatesOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code InterestOnCertificatesOfDeposit = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOnCertificatesOfDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.InterestOnCertificatesOfDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code USGovernmentInterest = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.USGovernmentInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterestOnNotesAndBills"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code USGovernmentInterestOnNotesAndBills = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterestOnNotesAndBills";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.USGovernmentInterestOnNotesAndBills.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalPaydowns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code PrincipalPaydowns = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalPaydowns";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.PrincipalPaydowns.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code ShortTermInterest = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.ShortTermInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterestLongerThan183Days"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code USGovernmentInterestLongerThan183Days = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterestLongerThan183Days";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.USGovernmentInterestLongerThan183Days.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestSubstitutePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code InterestSubstitutePayment = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestSubstitutePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.InterestSubstitutePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherSusbtitutePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code OtherSusbtitutePayment = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherSusbtitutePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.OtherSusbtitutePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NRAWithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code NRAWithholdingTax = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NRAWithholdingTax";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.NRAWithholdingTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalBackUpDividends"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code FederalBackUpDividends = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalBackUpDividends";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.FederalBackUpDividends.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalBackUpInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code FederalBackUpInterest = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalBackUpInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.FederalBackUpInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxWithheldAtSourceDividends"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code ForeignTaxWithheldAtSourceDividends = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxWithheldAtSourceDividends";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.ForeignTaxWithheldAtSourceDividends.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxWithheldAtSourceInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code ForeignTaxWithheldAtSourceInterest = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxWithheldAtSourceInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.ForeignTaxWithheldAtSourceInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyIssues"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code CustodyIssues = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyIssues";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.CustodyIssues.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOnBalances"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code InterestOnBalances = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOnBalances";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.InterestOnBalances.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOnSeriesEOrHBonds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code InterestOnSeriesEOrHBonds = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOnSeriesEOrHBonds";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.InterestOnSeriesEOrHBonds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoyaltyPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code RoyaltyPayments = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoyaltyPayments";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.RoyaltyPayments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTaxableIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code OtherTaxableIncome = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherTaxableIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.OtherTaxableIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNonTaxableIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code OtherNonTaxableIncome = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherNonTaxableIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.OtherNonTaxableIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code MiscellaneousPayments = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiscellaneousPayments";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.MiscellaneousPayments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfFractionalShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code CashInLieuOfFractionalShares = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfFractionalShares";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.CashInLieuOfFractionalShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code StockSplit = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code StockDividend = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOnIncreasedShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code CashOnIncreasedShares = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOnIncreasedShares";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.CashOnIncreasedShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax1Code NRATax1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax1Code SpinOff = new NRATax1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax1Code.mmObject();
			codeName = NRATaxCode.SpinOff.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NRATax1Code> codesByName = new LinkedHashMap<>();

	protected NRATax1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("T011");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NRATax1Code";
				definition = "Non resident alien U.S. tax codes.";
				trace_lazy = () -> NRATaxCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NRATax1Code.DomesticIncomeDividend, com.tools20022.repository.codeset.NRATax1Code.ForeignIncomeDividends,
						com.tools20022.repository.codeset.NRATax1Code.DividendsDomesticNonTaxable, com.tools20022.repository.codeset.NRATax1Code.DividendsFullyExempt,
						com.tools20022.repository.codeset.NRATax1Code.DividendsFederalTaxableStateExempt, com.tools20022.repository.codeset.NRATax1Code.ReturnOfCapital, com.tools20022.repository.codeset.NRATax1Code.LongTermCapitalGains,
						com.tools20022.repository.codeset.NRATax1Code.ShortTermCapitalGains, com.tools20022.repository.codeset.NRATax1Code.FIRPTAEligible, com.tools20022.repository.codeset.NRATax1Code.REITCapitalGainDistributions,
						com.tools20022.repository.codeset.NRATax1Code.LimitedPubliclyTradedPartnership, com.tools20022.repository.codeset.NRATax1Code.SubstituteDividendPayment,
						com.tools20022.repository.codeset.NRATax1Code.CapitalGainDistributionShortTermRICs, com.tools20022.repository.codeset.NRATax1Code.CorporateActionDividendCapitalGains,
						com.tools20022.repository.codeset.NRATax1Code.USSourceOrdinaryInterest, com.tools20022.repository.codeset.NRATax1Code.ForeignBondInterest,
						com.tools20022.repository.codeset.NRATax1Code.AllStateAndTerritorialMunicipalInterest, com.tools20022.repository.codeset.NRATax1Code.AllMunicipalBondsSubjectToFederalTax,
						com.tools20022.repository.codeset.NRATax1Code.USGovernmentInterestOnContractsNotesAndMortgages, com.tools20022.repository.codeset.NRATax1Code.USGovernmentInterestOnGNMA1And2,
						com.tools20022.repository.codeset.NRATax1Code.InterestOnCollatralizedMortgageObligations, com.tools20022.repository.codeset.NRATax1Code.InterestOnCertificatesOfDeposit,
						com.tools20022.repository.codeset.NRATax1Code.USGovernmentInterest, com.tools20022.repository.codeset.NRATax1Code.USGovernmentInterestOnNotesAndBills, com.tools20022.repository.codeset.NRATax1Code.PrincipalPaydowns,
						com.tools20022.repository.codeset.NRATax1Code.ShortTermInterest, com.tools20022.repository.codeset.NRATax1Code.USGovernmentInterestLongerThan183Days,
						com.tools20022.repository.codeset.NRATax1Code.InterestSubstitutePayment, com.tools20022.repository.codeset.NRATax1Code.OtherSusbtitutePayment, com.tools20022.repository.codeset.NRATax1Code.NRAWithholdingTax,
						com.tools20022.repository.codeset.NRATax1Code.FederalBackUpDividends, com.tools20022.repository.codeset.NRATax1Code.FederalBackUpInterest,
						com.tools20022.repository.codeset.NRATax1Code.ForeignTaxWithheldAtSourceDividends, com.tools20022.repository.codeset.NRATax1Code.ForeignTaxWithheldAtSourceInterest,
						com.tools20022.repository.codeset.NRATax1Code.CustodyIssues, com.tools20022.repository.codeset.NRATax1Code.InterestOnBalances, com.tools20022.repository.codeset.NRATax1Code.InterestOnSeriesEOrHBonds,
						com.tools20022.repository.codeset.NRATax1Code.RoyaltyPayments, com.tools20022.repository.codeset.NRATax1Code.OtherTaxableIncome, com.tools20022.repository.codeset.NRATax1Code.OtherNonTaxableIncome,
						com.tools20022.repository.codeset.NRATax1Code.MiscellaneousPayments, com.tools20022.repository.codeset.NRATax1Code.CashInLieuOfFractionalShares, com.tools20022.repository.codeset.NRATax1Code.StockSplit,
						com.tools20022.repository.codeset.NRATax1Code.StockDividend, com.tools20022.repository.codeset.NRATax1Code.CashOnIncreasedShares, com.tools20022.repository.codeset.NRATax1Code.SpinOff);
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

	public static NRATax1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NRATax1Code[] values() {
		NRATax1Code[] values = new NRATax1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NRATax1Code> {
		@Override
		public NRATax1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NRATax1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}