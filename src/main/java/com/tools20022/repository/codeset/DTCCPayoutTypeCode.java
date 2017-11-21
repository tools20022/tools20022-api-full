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
 * Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout
 * types.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmCash
 * DTCCPayoutTypeCode.mmCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmSecurities
 * DTCCPayoutTypeCode.mmSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmDividend
 * DTCCPayoutTypeCode.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmReturnOfCapital
 * DTCCPayoutTypeCode.mmReturnOfCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmShortTermCapitalGains
 * DTCCPayoutTypeCode.mmShortTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmLongTermCapitalGains
 * DTCCPayoutTypeCode.mmLongTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmCapitalGains
 * DTCCPayoutTypeCode.mmCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmPremium
 * DTCCPayoutTypeCode.mmPremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmPrincipal
 * DTCCPayoutTypeCode.mmPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmInterest
 * DTCCPayoutTypeCode.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmFranked
 * DTCCPayoutTypeCode.mmFranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmUnfranked
 * DTCCPayoutTypeCode.mmUnfranked}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmOther
 * DTCCPayoutTypeCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#mmTaxCredit
 * DTCCPayoutTypeCode.mmTaxCredit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutType2Code
 * DTCCPayoutType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutType1Code
 * DTCCPayoutType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
 * DTCCPayoutType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutType4Code
 * DTCCPayoutType4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code
 * DTCCPayoutType5Code}</li>
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
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCPayoutTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout types."
 * </li>
 * </ul>
 */
public class DTCCPayoutTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payout consisting of cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payout consisting of cash."</li>
	 * </ul>
	 */
	public static final MMCode mmCash = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			definition = "Payout consisting of cash.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Payout consisting of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payout consisting of securities."</li>
	 * </ul>
	 */
	public static final MMCode mmSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Securities";
			definition = "Payout consisting of securities.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Distribution of earnings to shareholders categorised by company as
	 * dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of earnings to shareholders categorised by company as dividend."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Distribution of earnings to shareholders categorised by company as dividend.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Distribution that doesn't represent earnings and is categorized by the
	 * company as return of capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
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
	 * "Distribution that doesn't represent earnings and is categorized by the company as return of capital."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReturnOfCapital = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOfCapital";
			definition = "Distribution that doesn't represent earnings and is categorized by the company as return of capital.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "ROCA";
		}
	};
	/**
	 * Distribution of earnings to shareholders categorized by the company as
	 * short-term capital gains.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
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
	 * "Distribution of earnings to shareholders categorized by the company as short-term capital gains."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmShortTermCapitalGains = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGains";
			definition = "Distribution of earnings to shareholders categorized by the company as short-term capital gains.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "STCG";
		}
	};
	/**
	 * Distribution of earnings to shareholders categorized by the company as
	 * long-term capital gains.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
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
	 * "Distribution of earnings to shareholders categorized by the company as long-term capital gains."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLongTermCapitalGains = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGains";
			definition = "Distribution of earnings to shareholders categorized by the company as long-term capital gains.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "LTCG";
		}
	};
	/**
	 * Distribution of earnings to shareholders categorized by the company as
	 * capital gains.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
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
	 * "Distribution of earnings to shareholders categorized by the company as capital gains."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCapitalGains = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGains";
			definition = "Distribution of earnings to shareholders categorized by the company as capital gains.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "CAPG";
		}
	};
	/**
	 * Cash payment that is categorised by the issuer as premium, usually
	 * offered as incentive for early participation in an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash payment that is categorised by the issuer as premium, usually offered as incentive for early participation in an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPremium = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			definition = "Cash payment that is categorised by the issuer as premium, usually offered as incentive for early participation in an offer.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "PREM";
		}
	};
	/**
	 * Cash payment on a debt instrument that represents a return of principal
	 * to the holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
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
	 * "Cash payment on a debt instrument that represents a return of principal to the holder."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPrincipal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			definition = "Cash payment on a debt instrument that represents a return of principal to the holder.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "PRPL";
		}
	};
	/**
	 * Cash payment on a debt instrument calculated using the coupon rate,
	 * principal and period of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
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
	 * definition} =
	 * "Cash payment on a debt instrument calculated using the coupon rate, principal and period of time."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Cash payment on a debt instrument calculated using the coupon rate, principal and period of time.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * In some markets, companies further categorize dividends as franked or
	 * unfranked. "Franked" means that a tax credit is attached to that part of
	 * the dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Franked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In some markets, companies further categorize dividends as franked or unfranked. \"Franked\" means that a tax credit is attached to that part of the dividend."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFranked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Franked";
			definition = "In some markets, companies further categorize dividends as franked or unfranked. \"Franked\" means that a tax credit is attached to that part of the dividend.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "FLFR";
		}
	};
	/**
	 * In some markets, companies further categorize dividends as franked or
	 * unfranked. "Unfranked" means that there is no tax credit attached to the
	 * dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfranked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In some markets, companies further categorize dividends as franked or unfranked. \"Unfranked\" means that there is no tax credit attached to the dividend."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnfranked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfranked";
			definition = "In some markets, companies further categorize dividends as franked or unfranked. \"Unfranked\" means that there is no tax credit attached to the dividend.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "UNFR";
		}
	};
	/**
	 * Applies when a specific payout code cannot be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Applies when a specific payout code cannot be used."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Applies when a specific payout code cannot be used.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Payout consisting of a tax credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode
	 * DTCCPayoutTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payout consisting of a tax credit."</li>
	 * </ul>
	 */
	public static final MMCode mmTaxCredit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCredit";
			definition = "Payout consisting of a tax credit.";
			owner_lazy = () -> DTCCPayoutTypeCode.mmObject();
			codeName = "TXCR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCPayoutTypeCode";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout types.";
				code_lazy = () -> Arrays.asList(DTCCPayoutTypeCode.mmCash, DTCCPayoutTypeCode.mmSecurities, DTCCPayoutTypeCode.mmDividend, DTCCPayoutTypeCode.mmReturnOfCapital, DTCCPayoutTypeCode.mmShortTermCapitalGains,
						DTCCPayoutTypeCode.mmLongTermCapitalGains, DTCCPayoutTypeCode.mmCapitalGains, DTCCPayoutTypeCode.mmPremium, DTCCPayoutTypeCode.mmPrincipal, DTCCPayoutTypeCode.mmInterest, DTCCPayoutTypeCode.mmFranked,
						DTCCPayoutTypeCode.mmUnfranked, DTCCPayoutTypeCode.mmOther, DTCCPayoutTypeCode.mmTaxCredit);
				derivation_lazy = () -> Arrays.asList(DTCCPayoutType2Code.mmObject(), DTCCPayoutType1Code.mmObject(), DTCCPayoutType3Code.mmObject(), DTCCPayoutType4Code.mmObject(), DTCCPayoutType5Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}