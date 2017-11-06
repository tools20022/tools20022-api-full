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
 * Type or category of media inside an ATM cassette.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmCards
 * ATMMediaTypeCode.mmCards}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmCoins
 * ATMMediaTypeCode.mmCoins}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmCommodity
 * ATMMediaTypeCode.mmCommodity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmCoupons
 * ATMMediaTypeCode.mmCoupons}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmNotes
 * ATMMediaTypeCode.mmNotes}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmStamps
 * ATMMediaTypeCode.mmStamps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmUndetermined
 * ATMMediaTypeCode.mmUndetermined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmCheck
 * ATMMediaTypeCode.mmCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmCounterfeit
 * ATMMediaTypeCode.mmCounterfeit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmFit
 * ATMMediaTypeCode.mmFit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmFitAndUnfit
 * ATMMediaTypeCode.mmFitAndUnfit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmSuspect
 * ATMMediaTypeCode.mmSuspect}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmUnfit
 * ATMMediaTypeCode.mmUnfit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#mmUnrecognised
 * ATMMediaTypeCode.mmUnrecognised}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
 * ATMMediaType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType3Code
 * ATMMediaType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
 * ATMMediaType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMMediaTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type or category of media inside an ATM cassette."</li>
 * </ul>
 */
public class ATMMediaTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card media.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CARD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cards"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card media."</li>
	 * </ul>
	 */
	public static final MMCode mmCards = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cards";
			definition = "Card media.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "CARD";
		}
	};
	/**
	 * Coin media.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coins"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coin media."</li>
	 * </ul>
	 */
	public static final MMCode mmCoins = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coins";
			definition = "Coin media.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "COIN";
		}
	};
	/**
	 * Non fixed value of the media, for instance gold, silver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Non fixed value of the media, for instance gold, silver."</li>
	 * </ul>
	 */
	public static final MMCode mmCommodity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "Non fixed value of the media, for instance gold, silver.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "CMDT";
		}
	};
	/**
	 * Coupon media.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coupons"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coupon media."</li>
	 * </ul>
	 */
	public static final MMCode mmCoupons = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coupons";
			definition = "Coupon media.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "CPNS";
		}
	};
	/**
	 * Bank note media.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank note media."</li>
	 * </ul>
	 */
	public static final MMCode mmNotes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notes";
			definition = "Bank note media.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "NOTE";
		}
	};
	/**
	 * Stamp media.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stamps"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stamp media."</li>
	 * </ul>
	 */
	public static final MMCode mmStamps = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stamps";
			definition = "Stamp media.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "STMP";
		}
	};
	/**
	 * Undetermined medias.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UDTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undetermined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undetermined medias."</li>
	 * </ul>
	 */
	public static final MMCode mmUndetermined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undetermined";
			definition = "Undetermined medias.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "UDTM";
		}
	};
	/**
	 * Check media.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Check"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Check media."</li>
	 * </ul>
	 */
	public static final MMCode mmCheck = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Check";
			definition = "Check media.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "CHCK";
		}
	};
	/**
	 * Detected counterfeit media.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterfeit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detected counterfeit media."</li>
	 * </ul>
	 */
	public static final MMCode mmCounterfeit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counterfeit";
			definition = "Detected counterfeit media.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "CNTR";
		}
	};
	/**
	 * Fit media.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FITN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fit media."</li>
	 * </ul>
	 */
	public static final MMCode mmFit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fit";
			definition = "Fit media.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "FITN";
		}
	};
	/**
	 * Fit or unfit media, if fitness cannot be determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FITU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FitAndUnfit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fit or unfit media, if fitness cannot be determined."</li>
	 * </ul>
	 */
	public static final MMCode mmFitAndUnfit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FitAndUnfit";
			definition = "Fit or unfit media, if fitness cannot be determined.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "FITU";
		}
	};
	/**
	 * Suspect media.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspect media."</li>
	 * </ul>
	 */
	public static final MMCode mmSuspect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspect";
			definition = "Suspect media.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "SPCT";
		}
	};
	/**
	 * Unfit media (unacceptable quality).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unfit media (unacceptable quality)."</li>
	 * </ul>
	 */
	public static final MMCode mmUnfit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfit";
			definition = "Unfit media (unacceptable quality).";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "UNFT";
		}
	};
	/**
	 * Unrecognised media.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
	 * ATMMediaTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unrecognised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised media."</li>
	 * </ul>
	 */
	public static final MMCode mmUnrecognised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unrecognised";
			definition = "Unrecognised media.";
			owner_lazy = () -> ATMMediaTypeCode.mmObject();
			codeName = "UNRG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMMediaTypeCode";
				definition = "Type or category of media inside an ATM cassette.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMMediaTypeCode.mmCards, com.tools20022.repository.codeset.ATMMediaTypeCode.mmCoins, com.tools20022.repository.codeset.ATMMediaTypeCode.mmCommodity,
						com.tools20022.repository.codeset.ATMMediaTypeCode.mmCoupons, com.tools20022.repository.codeset.ATMMediaTypeCode.mmNotes, com.tools20022.repository.codeset.ATMMediaTypeCode.mmStamps,
						com.tools20022.repository.codeset.ATMMediaTypeCode.mmUndetermined, com.tools20022.repository.codeset.ATMMediaTypeCode.mmCheck, com.tools20022.repository.codeset.ATMMediaTypeCode.mmCounterfeit,
						com.tools20022.repository.codeset.ATMMediaTypeCode.mmFit, com.tools20022.repository.codeset.ATMMediaTypeCode.mmFitAndUnfit, com.tools20022.repository.codeset.ATMMediaTypeCode.mmSuspect,
						com.tools20022.repository.codeset.ATMMediaTypeCode.mmUnfit, com.tools20022.repository.codeset.ATMMediaTypeCode.mmUnrecognised);
				derivation_lazy = () -> Arrays.asList(ATMMediaType1Code.mmObject(), ATMMediaType3Code.mmObject(), ATMMediaType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}