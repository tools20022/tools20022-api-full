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
import com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of cash proceeds that the holder is eligible to reinvest.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#CashDividend
 * ReinvestmentIncomeClassificationCode.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#CashDividendOnIncreasedShares
 * ReinvestmentIncomeClassificationCode.CashDividendOnIncreasedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#CashDividendTaxUnfavorable
 * ReinvestmentIncomeClassificationCode.CashDividendTaxUnfavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#CashDividendTaxFavorable
 * ReinvestmentIncomeClassificationCode.CashDividendTaxFavorable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#CashDividendTaxExempt
 * ReinvestmentIncomeClassificationCode.CashDividendTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#CashDividendSpecial
 * ReinvestmentIncomeClassificationCode.CashDividendSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#Interest
 * ReinvestmentIncomeClassificationCode.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#Principal
 * ReinvestmentIncomeClassificationCode.Principal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#CapitalGains
 * ReinvestmentIncomeClassificationCode.CapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#LongTermCapitalGains
 * ReinvestmentIncomeClassificationCode.LongTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#ShortTermCapitalGains
 * ReinvestmentIncomeClassificationCode.ShortTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode#ReturnOfCapital
 * ReinvestmentIncomeClassificationCode.ReturnOfCapital}</li>
 * </ul>
 * </li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReinvestmentIncomeClassificationCode extends MMCode {

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
	public static final ReinvestmentIncomeClassificationCode CashDividend = new ReinvestmentIncomeClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			definition = "Cash proceeds being reinvested is classified as cash dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.mmObject();
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
	public static final ReinvestmentIncomeClassificationCode CashDividendOnIncreasedShares = new ReinvestmentIncomeClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendOnIncreasedShares";
			definition = "Cash proceeds being reinvested is classified as cash dividend on increased shares.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.mmObject();
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
	public static final ReinvestmentIncomeClassificationCode CashDividendTaxUnfavorable = new ReinvestmentIncomeClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendTaxUnfavorable";
			definition = "Cash proceeds being reinvested is classified as cash dividend at the unfavourable rate elected through the DTC (the Depository Trust Company) Foreign Tax Payment service.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.mmObject();
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
	public static final ReinvestmentIncomeClassificationCode CashDividendTaxFavorable = new ReinvestmentIncomeClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendTaxFavorable";
			definition = "Cash proceeds being reinvested is classified as cash dividend at the favourable rate elected through the DTC (the Depository Trust Company) Foreign Tax Payment service.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.mmObject();
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
	public static final ReinvestmentIncomeClassificationCode CashDividendTaxExempt = new ReinvestmentIncomeClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendTaxExempt";
			definition = "Cash proceeds being reinvested is classified as cash dividend at the exempt rate elected through the DTC (the Depository Trust Company)  Foreign Tax Payment service.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.mmObject();
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
	public static final ReinvestmentIncomeClassificationCode CashDividendSpecial = new ReinvestmentIncomeClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividendSpecial";
			definition = "Cash proceeds being reinvested is classified as special cash dividend. ";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.mmObject();
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
	public static final ReinvestmentIncomeClassificationCode Interest = new ReinvestmentIncomeClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Cash proceeds being reinvested is classified as interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.mmObject();
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
	public static final ReinvestmentIncomeClassificationCode Principal = new ReinvestmentIncomeClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			definition = "Cash proceeds being reinvested is classified as principal.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.mmObject();
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
	public static final ReinvestmentIncomeClassificationCode CapitalGains = new ReinvestmentIncomeClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGains";
			definition = "Cash proceeds being reinvested is classified as capital gains.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.mmObject();
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
	public static final ReinvestmentIncomeClassificationCode LongTermCapitalGains = new ReinvestmentIncomeClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGains";
			definition = "Cash proceeds being reinvested is classified as long term capital gains.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.mmObject();
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
	public static final ReinvestmentIncomeClassificationCode ShortTermCapitalGains = new ReinvestmentIncomeClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGains";
			definition = "Cash proceeds being reinvested is classified as short term capital gains.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.mmObject();
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
	public static final ReinvestmentIncomeClassificationCode ReturnOfCapital = new ReinvestmentIncomeClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOfCapital";
			definition = "Cash proceeds being reinvested is classified as return of capital.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.mmObject();
			codeName = "ROCA";
		}
	};
	final static private LinkedHashMap<String, ReinvestmentIncomeClassificationCode> codesByName = new LinkedHashMap<>();

	protected ReinvestmentIncomeClassificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DVCA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReinvestmentIncomeClassificationCode";
				definition = "Specifies the type of cash proceeds that the holder is eligible to reinvest.";
				derivation_lazy = () -> Arrays.asList(ReinvestmentIncomeClassification1Code.mmObject(), ReinvestmentIncomeClassification2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.CashDividend, com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.CashDividendOnIncreasedShares,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.CashDividendTaxUnfavorable, com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.CashDividendTaxFavorable,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.CashDividendTaxExempt, com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.CashDividendSpecial,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.Interest, com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.Principal,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.CapitalGains, com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.LongTermCapitalGains,
						com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.ShortTermCapitalGains, com.tools20022.repository.codeset.ReinvestmentIncomeClassificationCode.ReturnOfCapital);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(CashDividendOnIncreasedShares.getCodeName().get(), CashDividendOnIncreasedShares);
		codesByName.put(CashDividendTaxUnfavorable.getCodeName().get(), CashDividendTaxUnfavorable);
		codesByName.put(CashDividendTaxFavorable.getCodeName().get(), CashDividendTaxFavorable);
		codesByName.put(CashDividendTaxExempt.getCodeName().get(), CashDividendTaxExempt);
		codesByName.put(CashDividendSpecial.getCodeName().get(), CashDividendSpecial);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(Principal.getCodeName().get(), Principal);
		codesByName.put(CapitalGains.getCodeName().get(), CapitalGains);
		codesByName.put(LongTermCapitalGains.getCodeName().get(), LongTermCapitalGains);
		codesByName.put(ShortTermCapitalGains.getCodeName().get(), ShortTermCapitalGains);
		codesByName.put(ReturnOfCapital.getCodeName().get(), ReturnOfCapital);
	}

	public static ReinvestmentIncomeClassificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReinvestmentIncomeClassificationCode[] values() {
		ReinvestmentIncomeClassificationCode[] values = new ReinvestmentIncomeClassificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReinvestmentIncomeClassificationCode> {
		@Override
		public ReinvestmentIncomeClassificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReinvestmentIncomeClassificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}