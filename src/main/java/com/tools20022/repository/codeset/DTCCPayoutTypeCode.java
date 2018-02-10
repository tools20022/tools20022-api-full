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
import com.tools20022.repository.codeset.DTCCPayoutTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout
 * types.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#Cash
 * DTCCPayoutTypeCode.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#Securities
 * DTCCPayoutTypeCode.Securities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#Dividend
 * DTCCPayoutTypeCode.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#ReturnOfCapital
 * DTCCPayoutTypeCode.ReturnOfCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#ShortTermCapitalGains
 * DTCCPayoutTypeCode.ShortTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#LongTermCapitalGains
 * DTCCPayoutTypeCode.LongTermCapitalGains}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#CapitalGains
 * DTCCPayoutTypeCode.CapitalGains}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#Premium
 * DTCCPayoutTypeCode.Premium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#Principal
 * DTCCPayoutTypeCode.Principal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#Interest
 * DTCCPayoutTypeCode.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#Franked
 * DTCCPayoutTypeCode.Franked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#Unfranked
 * DTCCPayoutTypeCode.Unfranked}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#Other
 * DTCCPayoutTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutTypeCode#TaxCredit
 * DTCCPayoutTypeCode.TaxCredit}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCPayoutTypeCode extends MMCode {

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
	public static final DTCCPayoutTypeCode Cash = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			definition = "Payout consisting of cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode Securities = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Securities";
			definition = "Payout consisting of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode Dividend = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Distribution of earnings to shareholders categorised by company as dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode ReturnOfCapital = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnOfCapital";
			definition = "Distribution that doesn't represent earnings and is categorized by the company as return of capital.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode ShortTermCapitalGains = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGains";
			definition = "Distribution of earnings to shareholders categorized by the company as short-term capital gains.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode LongTermCapitalGains = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGains";
			definition = "Distribution of earnings to shareholders categorized by the company as long-term capital gains.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode CapitalGains = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGains";
			definition = "Distribution of earnings to shareholders categorized by the company as capital gains.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode Premium = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			definition = "Cash payment that is categorised by the issuer as premium, usually offered as incentive for early participation in an offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode Principal = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			definition = "Cash payment on a debt instrument that represents a return of principal to the holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode Interest = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Cash payment on a debt instrument calculated using the coupon rate, principal and period of time.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode Franked = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Franked";
			definition = "In some markets, companies further categorize dividends as franked or unfranked. \"Franked\" means that a tax credit is attached to that part of the dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode Unfranked = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfranked";
			definition = "In some markets, companies further categorize dividends as franked or unfranked. \"Unfranked\" means that there is no tax credit attached to the dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode Other = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Applies when a specific payout code cannot be used.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
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
	public static final DTCCPayoutTypeCode TaxCredit = new DTCCPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCredit";
			definition = "Payout consisting of a tax credit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCPayoutTypeCode.mmObject();
			codeName = "TXCR";
		}
	};
	final static private LinkedHashMap<String, DTCCPayoutTypeCode> codesByName = new LinkedHashMap<>();

	protected DTCCPayoutTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCPayoutTypeCode";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined payout types.";
				derivation_lazy = () -> Arrays.asList(DTCCPayoutType2Code.mmObject(), DTCCPayoutType1Code.mmObject(), DTCCPayoutType3Code.mmObject(), DTCCPayoutType4Code.mmObject(), DTCCPayoutType5Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCPayoutTypeCode.Cash, com.tools20022.repository.codeset.DTCCPayoutTypeCode.Securities, com.tools20022.repository.codeset.DTCCPayoutTypeCode.Dividend,
						com.tools20022.repository.codeset.DTCCPayoutTypeCode.ReturnOfCapital, com.tools20022.repository.codeset.DTCCPayoutTypeCode.ShortTermCapitalGains,
						com.tools20022.repository.codeset.DTCCPayoutTypeCode.LongTermCapitalGains, com.tools20022.repository.codeset.DTCCPayoutTypeCode.CapitalGains, com.tools20022.repository.codeset.DTCCPayoutTypeCode.Premium,
						com.tools20022.repository.codeset.DTCCPayoutTypeCode.Principal, com.tools20022.repository.codeset.DTCCPayoutTypeCode.Interest, com.tools20022.repository.codeset.DTCCPayoutTypeCode.Franked,
						com.tools20022.repository.codeset.DTCCPayoutTypeCode.Unfranked, com.tools20022.repository.codeset.DTCCPayoutTypeCode.Other, com.tools20022.repository.codeset.DTCCPayoutTypeCode.TaxCredit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(Securities.getCodeName().get(), Securities);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(ReturnOfCapital.getCodeName().get(), ReturnOfCapital);
		codesByName.put(ShortTermCapitalGains.getCodeName().get(), ShortTermCapitalGains);
		codesByName.put(LongTermCapitalGains.getCodeName().get(), LongTermCapitalGains);
		codesByName.put(CapitalGains.getCodeName().get(), CapitalGains);
		codesByName.put(Premium.getCodeName().get(), Premium);
		codesByName.put(Principal.getCodeName().get(), Principal);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(Franked.getCodeName().get(), Franked);
		codesByName.put(Unfranked.getCodeName().get(), Unfranked);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(TaxCredit.getCodeName().get(), TaxCredit);
	}

	public static DTCCPayoutTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCPayoutTypeCode[] values() {
		DTCCPayoutTypeCode[] values = new DTCCPayoutTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCPayoutTypeCode> {
		@Override
		public DTCCPayoutTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCPayoutTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}