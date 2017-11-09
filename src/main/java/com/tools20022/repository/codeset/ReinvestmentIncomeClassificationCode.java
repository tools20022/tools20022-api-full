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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of cash proceeds that the holder is eligible to reinvest.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
 * ReinvestmentIncomeClassification1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification2Code
 * ReinvestmentIncomeClassification2Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#mmCashDividend
 * ReinvestmentIncomeClassificationCode.mmCashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#mmCashDividendOnIncreasedShares
 * ReinvestmentIncomeClassificationCode.mmCashDividendOnIncreasedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#mmCashDividendTaxUnfavorable
 * ReinvestmentIncomeClassificationCode.mmCashDividendTaxUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#mmCashDividendTaxFavorable
 * ReinvestmentIncomeClassificationCode.mmCashDividendTaxFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#mmCashDividendTaxExempt
 * ReinvestmentIncomeClassificationCode.mmCashDividendTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#mmCashDividendSpecial
 * ReinvestmentIncomeClassificationCode.mmCashDividendSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#mmInterest
 * ReinvestmentIncomeClassificationCode.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#mmPrincipal
 * ReinvestmentIncomeClassificationCode.mmPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#mmCapitalGains
 * ReinvestmentIncomeClassificationCode.mmCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#mmLongTermCapitalGains
 * ReinvestmentIncomeClassificationCode.mmLongTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#mmShortTermCapitalGains
 * ReinvestmentIncomeClassificationCode.mmShortTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#mmReturnOfCapital
 * ReinvestmentIncomeClassificationCode.mmReturnOfCapital}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DVCA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReinvestmentIncomeClassificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of cash proceeds that the holder is eligible to reinvest."
 * </li>
 * </ul>
 */
public class ReinvestmentIncomeClassificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash proceeds being reinvested is classified as cash dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
	 * ReinvestmentIncomeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds being reinvested is classified as cash dividend."</li>
	 * </ul>
	 */
	public static final MMCode mmCashDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			definition = "Cash proceeds being reinvested is classified as cash dividend.";
			owner_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "DVCA";
		}
	};
	/**
	 * Cash proceeds being reinvested is classified as cash dividend on
	 * increased shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
	 * ReinvestmentIncomeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividendOnIncreasedShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds being reinvested is classified as cash dividend on increased shares."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCashDividendOnIncreasedShares = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendOnIncreasedShares";
			definition = "Cash proceeds being reinvested is classified as cash dividend on increased shares.";
			owner_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "CDIS";
		}
	};
	/**
	 * Cash proceeds being reinvested is classified as cash dividend at the
	 * unfavourable rate elected through the DTC (the Depository Trust Company)
	 * Foreign Tax Payment service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
	 * ReinvestmentIncomeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividendTaxUnfavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds being reinvested is classified as cash dividend at the unfavourable rate elected through the DTC (the Depository Trust Company) Foreign Tax Payment service."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCashDividendTaxUnfavorable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendTaxUnfavorable";
			definition = "Cash proceeds being reinvested is classified as cash dividend at the unfavourable rate elected through the DTC (the Depository Trust Company) Foreign Tax Payment service.";
			owner_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "CDUN";
		}
	};
	/**
	 * Cash proceeds being reinvested is classified as cash dividend at the
	 * favourable rate elected through the DTC (the Depository Trust Company)
	 * Foreign Tax Payment service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
	 * ReinvestmentIncomeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDFV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividendTaxFavorable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds being reinvested is classified as cash dividend at the favourable rate elected through the DTC (the Depository Trust Company) Foreign Tax Payment service."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCashDividendTaxFavorable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendTaxFavorable";
			definition = "Cash proceeds being reinvested is classified as cash dividend at the favourable rate elected through the DTC (the Depository Trust Company) Foreign Tax Payment service.";
			owner_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "CDFV";
		}
	};
	/**
	 * Cash proceeds being reinvested is classified as cash dividend at the
	 * exempt rate elected through the DTC (the Depository Trust Company)
	 * Foreign Tax Payment service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
	 * ReinvestmentIncomeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividendTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds being reinvested is classified as cash dividend at the exempt rate elected through the DTC (the Depository Trust Company)  Foreign Tax Payment service."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCashDividendTaxExempt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendTaxExempt";
			definition = "Cash proceeds being reinvested is classified as cash dividend at the exempt rate elected through the DTC (the Depository Trust Company)  Foreign Tax Payment service.";
			owner_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "CDEX";
		}
	};
	/**
	 * Cash proceeds being reinvested is classified as special cash dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
	 * ReinvestmentIncomeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividendSpecial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds being reinvested is classified as special cash dividend. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCashDividendSpecial = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendSpecial";
			definition = "Cash proceeds being reinvested is classified as special cash dividend. ";
			owner_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "CDPS";
		}
	};
	/**
	 * Cash proceeds being reinvested is classified as interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
	 * ReinvestmentIncomeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash proceeds being reinvested is classified as interest."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Cash proceeds being reinvested is classified as interest.";
			owner_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Cash proceeds being reinvested is classified as principal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
	 * ReinvestmentIncomeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Principal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds being reinvested is classified as principal."</li>
	 * </ul>
	 */
	public static final MMCode mmPrincipal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			definition = "Cash proceeds being reinvested is classified as principal.";
			owner_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "PRPL";
		}
	};
	/**
	 * Cash proceeds being reinvested is classified as capital gains.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
	 * ReinvestmentIncomeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGains"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds being reinvested is classified as capital gains."</li>
	 * </ul>
	 */
	public static final MMCode mmCapitalGains = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGains";
			definition = "Cash proceeds being reinvested is classified as capital gains.";
			owner_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "CAPG";
		}
	};
	/**
	 * Cash proceeds being reinvested is classified as long term capital gains.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
	 * ReinvestmentIncomeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTCG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGains"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds being reinvested is classified as long term capital gains."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLongTermCapitalGains = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGains";
			definition = "Cash proceeds being reinvested is classified as long term capital gains.";
			owner_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "LTCG";
		}
	};
	/**
	 * Cash proceeds being reinvested is classified as short term capital gains.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
	 * ReinvestmentIncomeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STCG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGains"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds being reinvested is classified as short term capital gains."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmShortTermCapitalGains = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGains";
			definition = "Cash proceeds being reinvested is classified as short term capital gains.";
			owner_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "STCG";
		}
	};
	/**
	 * Cash proceeds being reinvested is classified as return of capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode
	 * ReinvestmentIncomeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ROCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnOfCapital"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds being reinvested is classified as return of capital."</li>
	 * </ul>
	 */
	public static final MMCode mmReturnOfCapital = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOfCapital";
			definition = "Cash proceeds being reinvested is classified as return of capital.";
			owner_lazy = () -> ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "ROCA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DVCA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReinvestmentIncomeClassificationCode";
				definition = "Specifies the type of cash proceeds that the holder is eligible to reinvest.";
				code_lazy = () -> Arrays.asList(ReinvestmentIncomeClassificationCode.mmCashDividend, ReinvestmentIncomeClassificationCode.mmCashDividendOnIncreasedShares, ReinvestmentIncomeClassificationCode.mmCashDividendTaxUnfavorable,
						ReinvestmentIncomeClassificationCode.mmCashDividendTaxFavorable, ReinvestmentIncomeClassificationCode.mmCashDividendTaxExempt, ReinvestmentIncomeClassificationCode.mmCashDividendSpecial,
						ReinvestmentIncomeClassificationCode.mmInterest, ReinvestmentIncomeClassificationCode.mmPrincipal, ReinvestmentIncomeClassificationCode.mmCapitalGains, ReinvestmentIncomeClassificationCode.mmLongTermCapitalGains,
						ReinvestmentIncomeClassificationCode.mmShortTermCapitalGains, ReinvestmentIncomeClassificationCode.mmReturnOfCapital);
				derivation_lazy = () -> Arrays.asList(ReinvestmentIncomeClassification1Code.mmObject(), ReinvestmentIncomeClassification2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}