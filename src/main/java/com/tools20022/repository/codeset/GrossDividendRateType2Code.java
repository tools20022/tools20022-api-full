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
import com.tools20022.repository.codeset.DividendRateTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of gross dividend rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
 * DividendRateTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmCapitalPortion
 * GrossDividendRateType2Code.mmCapitalPortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmFullPeriodUnitsIncomePortion
 * GrossDividendRateType2Code.mmFullPeriodUnitsIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmFullyFranked
 * GrossDividendRateType2Code.mmFullyFranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmIncomePortion
 * GrossDividendRateType2Code.mmIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmInterest
 * GrossDividendRateType2Code.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmLongTermCapitalGain
 * GrossDividendRateType2Code.mmLongTermCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmPartWayPeriodUnitsIncomePortion
 * GrossDividendRateType2Code.mmPartWayPeriodUnitsIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmShortTermCapitalGain
 * GrossDividendRateType2Code.mmShortTermCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmSundryOrOtherIncome
 * GrossDividendRateType2Code.mmSundryOrOtherIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmTaxablePortion
 * GrossDividendRateType2Code.mmTaxablePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmTaxDeferred
 * GrossDividendRateType2Code.mmTaxDeferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmTaxFree
 * GrossDividendRateType2Code.mmTaxFree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmUnfranked
 * GrossDividendRateType2Code.mmUnfranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code#mmRealEstatePropertyIncomePortion
 * GrossDividendRateType2Code.mmRealEstatePropertyIncomePortion}</li>
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
 * <li>"CAPO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GrossDividendRateType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of gross dividend rate."</li>
 * </ul>
 */
public class GrossDividendRateType2Code extends DividendRateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalPortion"</li>
	 * </ul>
	 */
	public static final MMCode mmCapitalPortion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalPortion";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPeriodUnitsIncomePortion"</li>
	 * </ul>
	 */
	public static final MMCode mmFullPeriodUnitsIncomePortion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPeriodUnitsIncomePortion";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFranked"</li>
	 * </ul>
	 */
	public static final MMCode mmFullyFranked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFranked";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePortion"</li>
	 * </ul>
	 */
	public static final MMCode mmIncomePortion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePortion";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final MMCode mmInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGain"</li>
	 * </ul>
	 */
	public static final MMCode mmLongTermCapitalGain = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGain";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartWayPeriodUnitsIncomePortion"</li>
	 * </ul>
	 */
	public static final MMCode mmPartWayPeriodUnitsIncomePortion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartWayPeriodUnitsIncomePortion";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGain"</li>
	 * </ul>
	 */
	public static final MMCode mmShortTermCapitalGain = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGain";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherIncome"</li>
	 * </ul>
	 */
	public static final MMCode mmSundryOrOtherIncome = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SundryOrOtherIncome";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxablePortion"</li>
	 * </ul>
	 */
	public static final MMCode mmTaxablePortion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxablePortion";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeferred"</li>
	 * </ul>
	 */
	public static final MMCode mmTaxDeferred = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeferred";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxFree"</li>
	 * </ul>
	 */
	public static final MMCode mmTaxFree = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxFree";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfranked"</li>
	 * </ul>
	 */
	public static final MMCode mmUnfranked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfranked";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType2Code
	 * GrossDividendRateType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstatePropertyIncomePortion"</li>
	 * </ul>
	 */
	public static final MMCode mmRealEstatePropertyIncomePortion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstatePropertyIncomePortion";
			owner_lazy = () -> GrossDividendRateType2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CAPO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GrossDividendRateType2Code";
				definition = "Specifies the type of gross dividend rate.";
				code_lazy = () -> Arrays.asList(GrossDividendRateType2Code.mmCapitalPortion, GrossDividendRateType2Code.mmFullPeriodUnitsIncomePortion, GrossDividendRateType2Code.mmFullyFranked, GrossDividendRateType2Code.mmIncomePortion,
						GrossDividendRateType2Code.mmInterest, GrossDividendRateType2Code.mmLongTermCapitalGain, GrossDividendRateType2Code.mmPartWayPeriodUnitsIncomePortion, GrossDividendRateType2Code.mmShortTermCapitalGain,
						GrossDividendRateType2Code.mmSundryOrOtherIncome, GrossDividendRateType2Code.mmTaxablePortion, GrossDividendRateType2Code.mmTaxDeferred, GrossDividendRateType2Code.mmTaxFree, GrossDividendRateType2Code.mmUnfranked,
						GrossDividendRateType2Code.mmRealEstatePropertyIncomePortion);
				trace_lazy = () -> DividendRateTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}