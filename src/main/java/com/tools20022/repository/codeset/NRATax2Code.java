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
import com.tools20022.repository.codeset.NRATax2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#DomesticIncomeDividend
 * NRATax2Code.DomesticIncomeDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#ForeignIncomeDividends
 * NRATax2Code.ForeignIncomeDividends}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#DividendsDomesticNonTaxable
 * NRATax2Code.DividendsDomesticNonTaxable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#DividendsFullyExempt
 * NRATax2Code.DividendsFullyExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#DividendsFederalTaxableStateExempt
 * NRATax2Code.DividendsFederalTaxableStateExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#ReturnOfCapital
 * NRATax2Code.ReturnOfCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#LongTermCapitalGains
 * NRATax2Code.LongTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#ShortTermCapitalGains
 * NRATax2Code.ShortTermCapitalGains}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATax2Code#FIRPTAEligible
 * NRATax2Code.FIRPTAEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#REITCapitalGainDistributions
 * NRATax2Code.REITCapitalGainDistributions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#LimitedPubliclyTradedPartnership
 * NRATax2Code.LimitedPubliclyTradedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#SubstituteDividendPayment
 * NRATax2Code.SubstituteDividendPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#CapitalGainDistributionShortTermRICs
 * NRATax2Code.CapitalGainDistributionShortTermRICs}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#CorporateActionDividendCapitalGains
 * NRATax2Code.CorporateActionDividendCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#USSourceOrdinaryInterest
 * NRATax2Code.USSourceOrdinaryInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#ForeignBondInterest
 * NRATax2Code.ForeignBondInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#AllStateAndTerritorialMunicipalInterest
 * NRATax2Code.AllStateAndTerritorialMunicipalInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#AllMunicipalBondsSubjectToFederalTax
 * NRATax2Code.AllMunicipalBondsSubjectToFederalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#USGovernmentInterestOnContractsNotesAndMortgages
 * NRATax2Code.USGovernmentInterestOnContractsNotesAndMortgages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#USGovernmentInterestOnGNMA1And2
 * NRATax2Code.USGovernmentInterestOnGNMA1And2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#InterestOnCollatralizedMortgageObligations
 * NRATax2Code.InterestOnCollatralizedMortgageObligations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#InterestOnCertificatesOfDeposit
 * NRATax2Code.InterestOnCertificatesOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#USGovernmentInterest
 * NRATax2Code.USGovernmentInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#USGovernmentInterestOnNotesAndBills
 * NRATax2Code.USGovernmentInterestOnNotesAndBills}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#PrincipalPaydowns
 * NRATax2Code.PrincipalPaydowns}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#InterestSubstitutePayment
 * NRATax2Code.InterestSubstitutePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#RoyaltyPayments
 * NRATax2Code.RoyaltyPayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#OtherTaxableIncome
 * NRATax2Code.OtherTaxableIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#OtherNonTaxableIncome
 * NRATax2Code.OtherNonTaxableIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NRATax2Code#MiscellaneousPayments
 * NRATax2Code.MiscellaneousPayments}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATax2Code#StockSplit
 * NRATax2Code.StockSplit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATax2Code#StockDividend
 * NRATax2Code.StockDividend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NRATax2Code#SpinOff
 * NRATax2Code.SpinOff}</li>
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
 * "NRATax2Code"</li>
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
public class NRATax2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticIncomeDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code DomesticIncomeDividend = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticIncomeDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.DomesticIncomeDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignIncomeDividends"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code ForeignIncomeDividends = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignIncomeDividends";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.ForeignIncomeDividends.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsDomesticNonTaxable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code DividendsDomesticNonTaxable = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendsDomesticNonTaxable";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.DividendsDomesticNonTaxable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsFullyExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code DividendsFullyExempt = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendsFullyExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.DividendsFullyExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsFederalTaxableStateExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code DividendsFederalTaxableStateExempt = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendsFederalTaxableStateExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.DividendsFederalTaxableStateExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOfCapital"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code ReturnOfCapital = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOfCapital";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.ReturnOfCapital.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGains"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code LongTermCapitalGains = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.LongTermCapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGains"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code ShortTermCapitalGains = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.ShortTermCapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FIRPTAEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code FIRPTAEligible = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FIRPTAEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.FIRPTAEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "REITCapitalGainDistributions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code REITCapitalGainDistributions = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "REITCapitalGainDistributions";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.REITCapitalGainDistributions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPubliclyTradedPartnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code LimitedPubliclyTradedPartnership = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPubliclyTradedPartnership";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.LimitedPubliclyTradedPartnership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstituteDividendPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code SubstituteDividendPayment = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstituteDividendPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.SubstituteDividendPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainDistributionShortTermRICs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code CapitalGainDistributionShortTermRICs = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainDistributionShortTermRICs";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.CapitalGainDistributionShortTermRICs.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDividendCapitalGains"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code CorporateActionDividendCapitalGains = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDividendCapitalGains";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.CorporateActionDividendCapitalGains.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USSourceOrdinaryInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code USSourceOrdinaryInterest = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USSourceOrdinaryInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.USSourceOrdinaryInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignBondInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code ForeignBondInterest = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignBondInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.ForeignBondInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllStateAndTerritorialMunicipalInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code AllStateAndTerritorialMunicipalInterest = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllStateAndTerritorialMunicipalInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.AllStateAndTerritorialMunicipalInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllMunicipalBondsSubjectToFederalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code AllMunicipalBondsSubjectToFederalTax = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllMunicipalBondsSubjectToFederalTax";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.AllMunicipalBondsSubjectToFederalTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterestOnContractsNotesAndMortgages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code USGovernmentInterestOnContractsNotesAndMortgages = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterestOnContractsNotesAndMortgages";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.USGovernmentInterestOnContractsNotesAndMortgages.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterestOnGNMA1And2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code USGovernmentInterestOnGNMA1And2 = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterestOnGNMA1And2";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.USGovernmentInterestOnGNMA1And2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOnCollatralizedMortgageObligations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code InterestOnCollatralizedMortgageObligations = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOnCollatralizedMortgageObligations";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.InterestOnCollatralizedMortgageObligations.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOnCertificatesOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code InterestOnCertificatesOfDeposit = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOnCertificatesOfDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.InterestOnCertificatesOfDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code USGovernmentInterest = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterest";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.USGovernmentInterest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USGovernmentInterestOnNotesAndBills"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code USGovernmentInterestOnNotesAndBills = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USGovernmentInterestOnNotesAndBills";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.USGovernmentInterestOnNotesAndBills.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalPaydowns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code PrincipalPaydowns = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalPaydowns";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.PrincipalPaydowns.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestSubstitutePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code InterestSubstitutePayment = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestSubstitutePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.InterestSubstitutePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoyaltyPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code RoyaltyPayments = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoyaltyPayments";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.RoyaltyPayments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTaxableIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code OtherTaxableIncome = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherTaxableIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.OtherTaxableIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNonTaxableIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code OtherNonTaxableIncome = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherNonTaxableIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.OtherNonTaxableIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code MiscellaneousPayments = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiscellaneousPayments";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.MiscellaneousPayments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code StockSplit = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code StockDividend = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NRATax2Code NRATax2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NRATax2Code SpinOff = new NRATax2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			owner_lazy = () -> com.tools20022.repository.codeset.NRATax2Code.mmObject();
			codeName = NRATaxCode.SpinOff.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NRATax2Code> codesByName = new LinkedHashMap<>();

	protected NRATax2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("T011");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NRATax2Code";
				definition = "Non resident alien U.S. tax codes.";
				trace_lazy = () -> NRATaxCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NRATax2Code.DomesticIncomeDividend, com.tools20022.repository.codeset.NRATax2Code.ForeignIncomeDividends,
						com.tools20022.repository.codeset.NRATax2Code.DividendsDomesticNonTaxable, com.tools20022.repository.codeset.NRATax2Code.DividendsFullyExempt,
						com.tools20022.repository.codeset.NRATax2Code.DividendsFederalTaxableStateExempt, com.tools20022.repository.codeset.NRATax2Code.ReturnOfCapital, com.tools20022.repository.codeset.NRATax2Code.LongTermCapitalGains,
						com.tools20022.repository.codeset.NRATax2Code.ShortTermCapitalGains, com.tools20022.repository.codeset.NRATax2Code.FIRPTAEligible, com.tools20022.repository.codeset.NRATax2Code.REITCapitalGainDistributions,
						com.tools20022.repository.codeset.NRATax2Code.LimitedPubliclyTradedPartnership, com.tools20022.repository.codeset.NRATax2Code.SubstituteDividendPayment,
						com.tools20022.repository.codeset.NRATax2Code.CapitalGainDistributionShortTermRICs, com.tools20022.repository.codeset.NRATax2Code.CorporateActionDividendCapitalGains,
						com.tools20022.repository.codeset.NRATax2Code.USSourceOrdinaryInterest, com.tools20022.repository.codeset.NRATax2Code.ForeignBondInterest,
						com.tools20022.repository.codeset.NRATax2Code.AllStateAndTerritorialMunicipalInterest, com.tools20022.repository.codeset.NRATax2Code.AllMunicipalBondsSubjectToFederalTax,
						com.tools20022.repository.codeset.NRATax2Code.USGovernmentInterestOnContractsNotesAndMortgages, com.tools20022.repository.codeset.NRATax2Code.USGovernmentInterestOnGNMA1And2,
						com.tools20022.repository.codeset.NRATax2Code.InterestOnCollatralizedMortgageObligations, com.tools20022.repository.codeset.NRATax2Code.InterestOnCertificatesOfDeposit,
						com.tools20022.repository.codeset.NRATax2Code.USGovernmentInterest, com.tools20022.repository.codeset.NRATax2Code.USGovernmentInterestOnNotesAndBills, com.tools20022.repository.codeset.NRATax2Code.PrincipalPaydowns,
						com.tools20022.repository.codeset.NRATax2Code.InterestSubstitutePayment, com.tools20022.repository.codeset.NRATax2Code.RoyaltyPayments, com.tools20022.repository.codeset.NRATax2Code.OtherTaxableIncome,
						com.tools20022.repository.codeset.NRATax2Code.OtherNonTaxableIncome, com.tools20022.repository.codeset.NRATax2Code.MiscellaneousPayments, com.tools20022.repository.codeset.NRATax2Code.StockSplit,
						com.tools20022.repository.codeset.NRATax2Code.StockDividend, com.tools20022.repository.codeset.NRATax2Code.SpinOff);
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
		codesByName.put(InterestSubstitutePayment.getCodeName().get(), InterestSubstitutePayment);
		codesByName.put(RoyaltyPayments.getCodeName().get(), RoyaltyPayments);
		codesByName.put(OtherTaxableIncome.getCodeName().get(), OtherTaxableIncome);
		codesByName.put(OtherNonTaxableIncome.getCodeName().get(), OtherNonTaxableIncome);
		codesByName.put(MiscellaneousPayments.getCodeName().get(), MiscellaneousPayments);
		codesByName.put(StockSplit.getCodeName().get(), StockSplit);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(SpinOff.getCodeName().get(), SpinOff);
	}

	public static NRATax2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NRATax2Code[] values() {
		NRATax2Code[] values = new NRATax2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NRATax2Code> {
		@Override
		public NRATax2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NRATax2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}