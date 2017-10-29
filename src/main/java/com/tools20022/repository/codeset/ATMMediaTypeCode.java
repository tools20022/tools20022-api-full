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
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Cards
 * ATMMediaTypeCode.Cards}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Coins
 * ATMMediaTypeCode.Coins}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Commodity
 * ATMMediaTypeCode.Commodity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Coupons
 * ATMMediaTypeCode.Coupons}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Notes
 * ATMMediaTypeCode.Notes}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Stamps
 * ATMMediaTypeCode.Stamps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Undetermined
 * ATMMediaTypeCode.Undetermined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Check
 * ATMMediaTypeCode.Check}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Counterfeit
 * ATMMediaTypeCode.Counterfeit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Fit
 * ATMMediaTypeCode.Fit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#FitAndUnfit
 * ATMMediaTypeCode.FitAndUnfit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Suspect
 * ATMMediaTypeCode.Suspect}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Unfit
 * ATMMediaTypeCode.Unfit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode#Unrecognised
 * ATMMediaTypeCode.Unrecognised}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	public static final MMCode Cards = new MMCode() {
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
	public static final MMCode Coins = new MMCode() {
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
	public static final MMCode Commodity = new MMCode() {
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
	public static final MMCode Coupons = new MMCode() {
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
	public static final MMCode Notes = new MMCode() {
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
	public static final MMCode Stamps = new MMCode() {
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
	public static final MMCode Undetermined = new MMCode() {
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
	public static final MMCode Check = new MMCode() {
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
	public static final MMCode Counterfeit = new MMCode() {
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
	public static final MMCode Fit = new MMCode() {
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
	public static final MMCode FitAndUnfit = new MMCode() {
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
	public static final MMCode Suspect = new MMCode() {
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
	public static final MMCode Unfit = new MMCode() {
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
	public static final MMCode Unrecognised = new MMCode() {
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMMediaTypeCode";
				definition = "Type or category of media inside an ATM cassette.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMMediaTypeCode.Cards, com.tools20022.repository.codeset.ATMMediaTypeCode.Coins, com.tools20022.repository.codeset.ATMMediaTypeCode.Commodity,
						com.tools20022.repository.codeset.ATMMediaTypeCode.Coupons, com.tools20022.repository.codeset.ATMMediaTypeCode.Notes, com.tools20022.repository.codeset.ATMMediaTypeCode.Stamps,
						com.tools20022.repository.codeset.ATMMediaTypeCode.Undetermined, com.tools20022.repository.codeset.ATMMediaTypeCode.Check, com.tools20022.repository.codeset.ATMMediaTypeCode.Counterfeit,
						com.tools20022.repository.codeset.ATMMediaTypeCode.Fit, com.tools20022.repository.codeset.ATMMediaTypeCode.FitAndUnfit, com.tools20022.repository.codeset.ATMMediaTypeCode.Suspect,
						com.tools20022.repository.codeset.ATMMediaTypeCode.Unfit, com.tools20022.repository.codeset.ATMMediaTypeCode.Unrecognised);
				derivation_lazy = () -> Arrays.asList(ATMMediaType1Code.mmObject(), ATMMediaType3Code.mmObject(), ATMMediaType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}