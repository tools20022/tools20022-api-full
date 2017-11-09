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
 * Yield computation method.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmAfterTax
 * YieldTypeCode.mmAfterTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmAnnual
 * YieldTypeCode.mmAnnual}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmAtIssue
 * YieldTypeCode.mmAtIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmToAverageLife
 * YieldTypeCode.mmToAverageLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmToAverageMaturity
 * YieldTypeCode.mmToAverageMaturity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmBook
 * YieldTypeCode.mmBook}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmToNextCall
 * YieldTypeCode.mmToNextCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmChangeSinceClose
 * YieldTypeCode.mmChangeSinceClose}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmClosing
 * YieldTypeCode.mmClosing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmCompound
 * YieldTypeCode.mmCompound}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmCurrent
 * YieldTypeCode.mmCurrent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmTrueGross
 * YieldTypeCode.mmTrueGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmGovernmentEquivalent
 * YieldTypeCode.mmGovernmentEquivalent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmInflationAssumption
 * YieldTypeCode.mmInflationAssumption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmInverseFloater
 * YieldTypeCode.mmInverseFloater}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmLastClose
 * YieldTypeCode.mmLastClose}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmLastMonth
 * YieldTypeCode.mmLastMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmLastQuarter
 * YieldTypeCode.mmLastQuarter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmLastYear
 * YieldTypeCode.mmLastYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmLongestAverageLife
 * YieldTypeCode.mmLongestAverageLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmLongestAverage
 * YieldTypeCode.mmLongestAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmMarkToMarket
 * YieldTypeCode.mmMarkToMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmMaturity
 * YieldTypeCode.mmMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmToNextRefund
 * YieldTypeCode.mmToNextRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmOpenAverage
 * YieldTypeCode.mmOpenAverage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmToNextPut
 * YieldTypeCode.mmToNextPut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmPreviousClose
 * YieldTypeCode.mmPreviousClose}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmProceeds
 * YieldTypeCode.mmProceeds}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmSemiAnnual
 * YieldTypeCode.mmSemiAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmShortestAverageLife
 * YieldTypeCode.mmShortestAverageLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmShortestAverage
 * YieldTypeCode.mmShortestAverage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmSimple
 * YieldTypeCode.mmSimple}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmTaxEquivalent
 * YieldTypeCode.mmTaxEquivalent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmToTenderDate
 * YieldTypeCode.mmToTenderDate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmTrue
 * YieldTypeCode.mmTrue}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmProportion
 * YieldTypeCode.mmProportion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode#mmToWorstConvention
 * YieldTypeCode.mmToWorstConvention}</li>
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
 * <li>"AFTX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "YieldTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Yield computation method."</li>
 * </ul>
 */
public class YieldTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The yield on the bond net of any tax consequences from holding the bond.
	 * The discount on municipal securities can be subject to both capital gains
	 * taxes and ordinary income taxes. Calculated from dollar price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AFTX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield on the bond net of any tax consequences from holding the bond. The discount on municipal securities can be subject to both capital gains taxes and ordinary income taxes. Calculated from dollar price."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAfterTax = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterTax";
			definition = "The yield on the bond net of any tax consequences from holding the bond. The discount on municipal securities can be subject to both capital gains taxes and ordinary income taxes. Calculated from dollar price.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "AFTX";
		}
	};
	/**
	 * The annual interest or dividend income an investment earns, expressed as
	 * a percentage of the investment's total value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANNU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The annual interest or dividend income an investment earns, expressed as a percentage of the investment's total value."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAnnual = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			definition = "The annual interest or dividend income an investment earns, expressed as a percentage of the investment's total value.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "ANNU";
		}
	};
	/**
	 * The yield of the bond offered on the issue date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The yield of the bond offered on the issue date."</li>
	 * </ul>
	 */
	public static final MMCode mmAtIssue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtIssue";
			definition = "The yield of the bond offered on the issue date.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * The yield assuming that all sinks (mandatory and voluntary) are taken at
	 * par. This results in a faster paydown of debt; the yield is then
	 * calculated to the average life date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVLF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAverageLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield assuming that all sinks (mandatory and voluntary) are taken at par. This results in a faster paydown of debt; the yield is then calculated to the average life date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmToAverageLife = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAverageLife";
			definition = "The yield assuming that all sinks (mandatory and voluntary) are taken at par. This results in a faster paydown of debt; the yield is then calculated to the average life date.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "AVLF";
		}
	};
	/**
	 * The yield achieved by substituting a bond's average maturity for the
	 * issue's final maturity date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAverageMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield achieved by substituting a bond's average maturity for the issue's final maturity date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmToAverageMaturity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAverageMaturity";
			definition = "The yield achieved by substituting a bond's average maturity for the issue's final maturity date.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "AVMA";
		}
	};
	/**
	 * The yield of a security calculated by using its book value instead of the
	 * current market price. This term is typically used in the US domestic
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Book"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield of a security calculated by using its book value instead of the current market price.  This term is typically used in the US domestic market."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBook = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Book";
			definition = "The yield of a security calculated by using its book value instead of the current market price.  This term is typically used in the US domestic market.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "BOOK";
		}
	};
	/**
	 * The yield of a bond to the next possible call date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToNextCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The yield of a bond to the next possible call date."</li>
	 * </ul>
	 */
	public static final MMCode mmToNextCall = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToNextCall";
			definition = "The yield of a bond to the next possible call date.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "CALL";
		}
	};
	/**
	 * The change in the yield since the previous day's closing yield.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeSinceClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The change in the yield since the previous day's closing yield."</li>
	 * </ul>
	 */
	public static final MMCode mmChangeSinceClose = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeSinceClose";
			definition = "The change in the yield since the previous day's closing yield.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "CHCL";
		}
	};
	/**
	 * The yield of a bond based on the closing price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The yield of a bond based on the closing price."</li>
	 * </ul>
	 */
	public static final MMCode mmClosing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closing";
			definition = "The yield of a bond based on the closing price.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * The yield of certain Japanese bonds based on its price. Certain Japanese
	 * bonds have irregular first or last coupons, and the yield is calculated
	 * compound for these irregular periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield of certain Japanese bonds based on its price. Certain Japanese bonds have irregular first or last coupons, and the yield is calculated compound for these irregular periods."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCompound = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compound";
			definition = "The yield of certain Japanese bonds based on its price. Certain Japanese bonds have irregular first or last coupons, and the yield is calculated compound for these irregular periods.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "CMPD";
		}
	};
	/**
	 * Annual interest on a bond divided by the market value. The actual income
	 * rate of return as opposed to the coupon rate expressed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Annual interest on a bond divided by the market value. The actual income rate of return as opposed to the coupon rate expressed as a percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCurrent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			definition = "Annual interest on a bond divided by the market value. The actual income rate of return as opposed to the coupon rate expressed as a percentage.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "CRRT";
		}
	};
	/**
	 * Yield calculated using the price including accrued interest, where coupon
	 * dates are moved from holidays and weekends to the next trading day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrueGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Yield calculated using the price including accrued interest, where coupon dates are moved from holidays and weekends to the next trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTrueGross = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TrueGross";
			definition = "Yield calculated using the price including accrued interest, where coupon dates are moved from holidays and weekends to the next trading day.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "TRGR";
		}
	};
	/**
	 * Ask yield based on semi-annual coupons compounding in all periods and
	 * actual/actual calendar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GVEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentEquivalent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ask yield based on semi-annual coupons compounding in all periods and actual/actual calendar."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmGovernmentEquivalent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentEquivalent";
			definition = "Ask yield based on semi-annual coupons compounding in all periods and actual/actual calendar.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "GVEQ";
		}
	};
	/**
	 * Based on price, the return an investor would require on a normal bond
	 * that would make the real return equal to that of the inflation-indexed
	 * bond, assuming a constant inflation rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InflationAssumption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Based on price, the return an investor would require on a normal bond that would make the real return equal to that of the inflation-indexed bond, assuming a constant inflation rate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInflationAssumption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InflationAssumption";
			definition = "Based on price, the return an investor would require on a normal bond that would make the real return equal to that of the inflation-indexed bond, assuming a constant inflation rate.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "FLAS";
		}
	};
	/**
	 * Inverse Floater Bond Yield - Inverse floater semi-annual bond equivalent
	 * rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NVFL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InverseFloater"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Inverse Floater Bond Yield - Inverse floater semi-annual bond equivalent rate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInverseFloater = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InverseFloater";
			definition = "Inverse Floater Bond Yield - Inverse floater semi-annual bond equivalent rate.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "NVFL";
		}
	};
	/**
	 * Most Recent Closing Yield - The last available yield stored in history,
	 * computed using price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LSCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Most Recent Closing Yield - The last available yield stored in history, computed using price."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLastClose = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastClose";
			definition = "Most Recent Closing Yield - The last available yield stored in history, computed using price.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "LSCL";
		}
	};
	/**
	 * Closing Yield Most Recent Month - The yield of a bond based on the
	 * closing price as of the most recent month's end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LSMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing Yield Most Recent Month - The yield of a bond based on the closing price as of the most recent month's end."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLastMonth = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastMonth";
			definition = "Closing Yield Most Recent Month - The yield of a bond based on the closing price as of the most recent month's end.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "LSMT";
		}
	};
	/**
	 * Closing Yield Most Recent Quarter - The yield of a bond based on the
	 * closing price as of the most recent quarter's end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LSQR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastQuarter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing Yield Most Recent Quarter - The yield of a bond based on the closing price as of the most recent quarter's end."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLastQuarter = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastQuarter";
			definition = "Closing Yield Most Recent Quarter - The yield of a bond based on the closing price as of the most recent quarter's end.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "LSQR";
		}
	};
	/**
	 * Closing Yield Most Recent Year - The yield of a bond based on the closing
	 * price as of the most recent year's end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LSYR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing Yield Most Recent Year - The yield of a bond based on the closing price as of the most recent year's end."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLastYear = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastYear";
			definition = "Closing Yield Most Recent Year - The yield of a bond based on the closing price as of the most recent year's end.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "LSYR";
		}
	};
	/**
	 * The yield assuming only mandatory sinks are taken. This results in a
	 * lower paydown of debt; the yield is then calculated to the final payment
	 * date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LGAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongestAverageLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield assuming only mandatory sinks are taken.  This results in a lower paydown of debt; the yield is then calculated to the final payment date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLongestAverageLife = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongestAverageLife";
			definition = "The yield assuming only mandatory sinks are taken.  This results in a lower paydown of debt; the yield is then calculated to the final payment date.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "LGAL";
		}
	};
	/**
	 * Yield to Longest Average (Sinking Fund Bonds) - The yield assuming only
	 * mandatory sinks are taken. This results in a slower paydown of debt; the
	 * yield is then calculated to the final payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LGAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongestAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Yield to Longest Average (Sinking Fund Bonds) - The yield assuming only mandatory sinks are taken.  This results in a slower paydown of debt; the yield is then calculated to the final payment date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLongestAverage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongestAverage";
			definition = "Yield to Longest Average (Sinking Fund Bonds) - The yield assuming only mandatory sinks are taken.  This results in a slower paydown of debt; the yield is then calculated to the final payment date.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "LGAV";
		}
	};
	/**
	 * An adjustment in the valuation of a securities portfolio to reflect the
	 * current market values of the respective securities in the portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An adjustment in the valuation of a securities portfolio to reflect the current market values of the respective securities in the portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMarkToMarket = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarket";
			definition = "An adjustment in the valuation of a securities portfolio to reflect the current market values of the respective securities in the portfolio.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "MARK";
		}
	};
	/**
	 * The yield of a bond to its maturity date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTRY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Maturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The yield of a bond to its maturity date."</li>
	 * </ul>
	 */
	public static final MMCode mmMaturity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Maturity";
			definition = "The yield of a bond to its maturity date.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "MTRY";
		}
	};
	/**
	 * Yield To Next Refund (Sinking Fund Bonds) - Yield assuming all bonds are
	 * redeemed at the next refund date at the redemption price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NXRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToNextRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Yield To Next Refund (Sinking Fund Bonds) - Yield assuming all bonds are redeemed at the next refund date at the redemption price."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmToNextRefund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToNextRefund";
			definition = "Yield To Next Refund (Sinking Fund Bonds) - Yield assuming all bonds are redeemed at the next refund date at the redemption price.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "NXRF";
		}
	};
	/**
	 * The average yield of the respective securities in the portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The average yield of the respective securities in the portfolio."</li>
	 * </ul>
	 */
	public static final MMCode mmOpenAverage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenAverage";
			definition = "The average yield of the respective securities in the portfolio.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "PNAV";
		}
	};
	/**
	 * The yield to the date at which the bond holder can next put the bond to
	 * the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NXPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToNextPut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield to the date at which the bond holder can next put the bond to the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmToNextPut = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToNextPut";
			definition = "The yield to the date at which the bond holder can next put the bond to the issuer.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "NXPT";
		}
	};
	/**
	 * The yield of a bond based on the closing price 1 day ago.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The yield of a bond based on the closing price 1 day ago."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPreviousClose = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousClose";
			definition = "The yield of a bond based on the closing price 1 day ago.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "PRCL";
		}
	};
	/**
	 * The CD equivalent yield when the remaining time to maturity is less than
	 * two years.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRYL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The CD equivalent yield when the remaining time to maturity is less than two years."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmProceeds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proceeds";
			definition = "The CD equivalent yield when the remaining time to maturity is less than two years.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "PRYL";
		}
	};
	/**
	 * The yield of a bond whose coupon payments are reinvested semi-annually.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiAnnual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield of a bond whose coupon payments are reinvested semi-annually."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSemiAnnual = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SemiAnnual";
			definition = "The yield of a bond whose coupon payments are reinvested semi-annually.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "SEMI";
		}
	};
	/**
	 * The yield assuming that all sinks (mandatory and voluntary) are taken at
	 * par. This results in a faster paydown of debt; the yield is then
	 * calculated to the shortest average life date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHLF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortestAverageLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield assuming that all sinks (mandatory and voluntary) are taken at par. This results in a faster paydown of debt; the yield is then calculated to the shortest average life date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmShortestAverageLife = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortestAverageLife";
			definition = "The yield assuming that all sinks (mandatory and voluntary) are taken at par. This results in a faster paydown of debt; the yield is then calculated to the shortest average life date.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "SHLF";
		}
	};
	/**
	 * Yield to Shortest Average (Sinking Fund Bonds) - The yield assuming that
	 * all sinks (mandatory and voluntary) are taken. This results in a faster
	 * paydown of debt; the yield is then calculated to the final payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortestAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Yield to Shortest Average (Sinking Fund Bonds) - The yield assuming that all sinks (mandatory and voluntary) are taken.  This results in a faster paydown of debt; the yield is then calculated to the final payment date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmShortestAverage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortestAverage";
			definition = "Yield to Shortest Average (Sinking Fund Bonds) - The yield assuming that all sinks (mandatory and voluntary) are taken.  This results in a faster paydown of debt; the yield is then calculated to the final payment date.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "SHAV";
		}
	};
	/**
	 * The yield of a bond assuming no reinvestment of coupon payments. (Act/360
	 * day count).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Simple"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield of a bond assuming no reinvestment of coupon payments. (Act/360 day count)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSimple = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Simple";
			definition = "The yield of a bond assuming no reinvestment of coupon payments. (Act/360 day count).";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "SPLL";
		}
	};
	/**
	 * The after tax yield grossed up by the maximum federal tax rate of 39.6%.
	 * For comparison to taxable yields.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXQV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxEquivalent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The after tax yield grossed up by the maximum federal tax rate of 39.6%.  For comparison to taxable yields."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTaxEquivalent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxEquivalent";
			definition = "The after tax yield grossed up by the maximum federal tax rate of 39.6%.  For comparison to taxable yields.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "TXQV";
		}
	};
	/**
	 * The yield on a Municipal bond to its mandatory tender date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToTenderDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield on a Municipal bond to its mandatory tender date."</li>
	 * </ul>
	 */
	public static final MMCode mmToTenderDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToTenderDate";
			definition = "The yield on a Municipal bond to its mandatory tender date.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "TTDT";
		}
	};
	/**
	 * The yield calculated with coupon dates moved from a weekend or holiday to
	 * the next valid settlement date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRYL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "True"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The yield calculated with coupon dates moved from a weekend or holiday to the next valid settlement date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTrue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "True";
			definition = "The yield calculated with coupon dates moved from a weekend or holiday to the next valid settlement date.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "TRYL";
		}
	};
	/**
	 * Yield Value Of 1/32 - The amount that the yield will change for a 1/32nd
	 * change in price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VALU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proportion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Yield Value Of 1/32 - The amount that the yield will change for a 1/32nd change in price."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmProportion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proportion";
			definition = "Yield Value Of 1/32 - The amount that the yield will change for a 1/32nd change in price.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "VALU";
		}
	};
	/**
	 * The lowest yield to all possible redemption date scenarios.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.YieldTypeCode
	 * YieldTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WRST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToWorstConvention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lowest yield to all possible redemption date scenarios."</li>
	 * </ul>
	 */
	public static final MMCode mmToWorstConvention = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToWorstConvention";
			definition = "The lowest yield to all possible redemption date scenarios.";
			owner_lazy = () -> YieldTypeCode.mmObject();
			codeName = "WRST";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AFTX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "YieldTypeCode";
				definition = "Yield computation method.";
				code_lazy = () -> Arrays.asList(YieldTypeCode.mmAfterTax, YieldTypeCode.mmAnnual, YieldTypeCode.mmAtIssue, YieldTypeCode.mmToAverageLife, YieldTypeCode.mmToAverageMaturity, YieldTypeCode.mmBook, YieldTypeCode.mmToNextCall,
						YieldTypeCode.mmChangeSinceClose, YieldTypeCode.mmClosing, YieldTypeCode.mmCompound, YieldTypeCode.mmCurrent, YieldTypeCode.mmTrueGross, YieldTypeCode.mmGovernmentEquivalent, YieldTypeCode.mmInflationAssumption,
						YieldTypeCode.mmInverseFloater, YieldTypeCode.mmLastClose, YieldTypeCode.mmLastMonth, YieldTypeCode.mmLastQuarter, YieldTypeCode.mmLastYear, YieldTypeCode.mmLongestAverageLife, YieldTypeCode.mmLongestAverage,
						YieldTypeCode.mmMarkToMarket, YieldTypeCode.mmMaturity, YieldTypeCode.mmToNextRefund, YieldTypeCode.mmOpenAverage, YieldTypeCode.mmToNextPut, YieldTypeCode.mmPreviousClose, YieldTypeCode.mmProceeds,
						YieldTypeCode.mmSemiAnnual, YieldTypeCode.mmShortestAverageLife, YieldTypeCode.mmShortestAverage, YieldTypeCode.mmSimple, YieldTypeCode.mmTaxEquivalent, YieldTypeCode.mmToTenderDate, YieldTypeCode.mmTrue,
						YieldTypeCode.mmProportion, YieldTypeCode.mmToWorstConvention);
			}
		});
		return mmObject_lazy.get();
	}
}