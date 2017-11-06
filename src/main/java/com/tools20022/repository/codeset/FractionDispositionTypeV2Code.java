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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies how fractions resulting from derived securities will be processed
 * or how prorated decisions will be rounding, if provided with a pro ration
 * rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmBuyUp
 * FractionDispositionTypeV2Code.mmBuyUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmCashInLieuOfFraction
 * FractionDispositionTypeV2Code.mmCashInLieuOfFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmFull
 * FractionDispositionTypeV2Code.mmFull}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmNoFraction
 * FractionDispositionTypeV2Code.mmNoFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmProRate
 * FractionDispositionTypeV2Code.mmProRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmRoundUp
 * FractionDispositionTypeV2Code.mmRoundUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmRoundDown
 * FractionDispositionTypeV2Code.mmRoundDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmRoundToNearest
 * FractionDispositionTypeV2Code.mmRoundToNearest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmIssueFraction
 * FractionDispositionTypeV2Code.mmIssueFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmDiscussFirst
 * FractionDispositionTypeV2Code.mmDiscussFirst}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmSpecific
 * FractionDispositionTypeV2Code.mmSpecific}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmStandard
 * FractionDispositionTypeV2Code.mmStandard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmRetain
 * FractionDispositionTypeV2Code.mmRetain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmExpire
 * FractionDispositionTypeV2Code.mmExpire}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code#mmUnknown
 * FractionDispositionTypeV2Code.mmUnknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType10Code
 * FractionDispositionType10Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType11Code
 * FractionDispositionType11Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType8Code
 * FractionDispositionType8Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType9Code
 * FractionDispositionType9Code}</li>
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
 * <li>"BUYU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FractionDispositionTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
 * FractionDispositionTypeCode}</li>
 * </ul>
 */
public class FractionDispositionTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Buy securities up to next whole number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUYU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buy securities up to next whole number."</li>
	 * </ul>
	 */
	public static final MMCode mmBuyUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyUp";
			definition = "Buy securities up to next whole number.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "BUYU";
		}
	};
	/**
	 * Fractional part of cash. Take cash in lieu of fractions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fractional part of cash. Take cash in lieu of fractions."</li>
	 * </ul>
	 */
	public static final MMCode mmCashInLieuOfFraction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfFraction";
			definition = "Fractional part of cash. Take cash in lieu of fractions.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "CINL";
		}
	};
	/**
	 * Pre-allocate shares only if fully dealt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Full"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pre-allocate shares only if fully dealt."</li>
	 * </ul>
	 */
	public static final MMCode mmFull = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Full";
			definition = "Pre-allocate shares only if fully dealt.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * No fractional shares are allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No fractional shares are allowed."</li>
	 * </ul>
	 */
	public static final MMCode mmNoFraction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoFraction";
			definition = "No fractional shares are allowed.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "NOFR";
		}
	};
	/**
	 * In case of a partial fill, pro-rate the allocations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "In case of a partial fill, pro-rate the allocations."</li>
	 * </ul>
	 */
	public static final MMCode mmProRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProRate";
			definition = "In case of a partial fill, pro-rate the allocations.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "PROR";
		}
	};
	/**
	 * Round up to the next full unit/minimum nominal quantity at no cost.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Round up to the next full unit/minimum nominal quantity at no cost."</li>
	 * </ul>
	 */
	public static final MMCode mmRoundUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundUp";
			definition = "Round up to the next full unit/minimum nominal quantity at no cost.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "RDUP";
		}
	};
	/**
	 * Round the entitlement down to the last full unit/minimum nominal
	 * quantity, fractions are discarded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Round the entitlement down to the last full unit/minimum nominal quantity, fractions are discarded."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRoundDown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDown";
			definition = "Round the entitlement down to the last full unit/minimum nominal quantity, fractions are discarded.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "RDDN";
		}
	};
	/**
	 * If the fraction is greater than or equal to 0.5 of the resulting security
	 * then round up, else round down as specified in the respective RDUP and
	 * RDDN codes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundToNearest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the fraction is greater than or equal to 0.5 of the resulting security then round up, else round down as specified in the respective RDUP and RDDN codes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRoundToNearest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundToNearest";
			definition = "If the fraction is greater than or equal to 0.5 of the resulting security then round up, else round down as specified in the respective RDUP and RDDN codes.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * Take distribution of fractions in the form of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Take distribution of fractions in the form of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssueFraction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueFraction";
			definition = "Take distribution of fractions in the form of securities.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "DIST";
		}
	};
	/**
	 * Do not pro-rate; discuss first.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TALK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscussFirst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Do not pro-rate; discuss first."</li>
	 * </ul>
	 */
	public static final MMCode mmDiscussFirst = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscussFirst";
			definition = "Do not pro-rate; discuss first.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "TALK";
		}
	};
	/**
	 * Pre-allocate according to the amounts shown in a linked allocation
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Specific"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-allocate according to the amounts shown in a linked allocation instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSpecific = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Specific";
			definition = "Pre-allocate according to the amounts shown in a linked allocation instruction.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "SPEC";
		}
	};
	/**
	 * Indicates that if the fraction is greater than or equal to 0.5 of the
	 * value should be rounded up; otherwise rounded down.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that if the fraction is greater than or equal to 0.5 of the value should be rounded up; otherwise rounded down."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStandard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standard";
			definition = "Indicates that if the fraction is greater than or equal to 0.5 of the value should be rounded up; otherwise rounded down.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "SSTD";
		}
	};
	/**
	 * Indicates that fractional value should be retained; no rounding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that fractional value should be retained; no rounding."</li>
	 * </ul>
	 */
	public static final MMCode mmRetain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Retain";
			definition = "Indicates that fractional value should be retained; no rounding.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "RETA";
		}
	};
	/**
	 * Let fractions expire worthless.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expire"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Let fractions expire worthless."</li>
	 * </ul>
	 */
	public static final MMCode mmExpire = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expire";
			definition = "Let fractions expire worthless.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * Characteristics of the disposition of fractions are unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
	 * FractionDispositionTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Characteristics of the disposition of fractions are unknown."</li>
	 * </ul>
	 */
	public static final MMCode mmUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Characteristics of the disposition of fractions are unknown.";
			owner_lazy = () -> FractionDispositionTypeV2Code.mmObject();
			codeName = "UKWN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("BUYU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FractionDispositionTypeV2Code";
				definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
				previousVersion_lazy = () -> FractionDispositionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmBuyUp, com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmCashInLieuOfFraction,
						com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmFull, com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmNoFraction,
						com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmProRate, com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmRoundUp,
						com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmRoundDown, com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmRoundToNearest,
						com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmIssueFraction, com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmDiscussFirst,
						com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmSpecific, com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmStandard,
						com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmRetain, com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmExpire,
						com.tools20022.repository.codeset.FractionDispositionTypeV2Code.mmUnknown);
				derivation_lazy = () -> Arrays.asList(FractionDispositionType10Code.mmObject(), FractionDispositionType11Code.mmObject(), FractionDispositionType8Code.mmObject(), FractionDispositionType9Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}