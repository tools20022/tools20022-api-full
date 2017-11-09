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
import com.tools20022.repository.codeset.ATMMediaTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of media inside an ATM cassette.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMMediaTypeCode
 * ATMMediaTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#mmCards
 * ATMMediaType1Code.mmCards}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#mmCoins
 * ATMMediaType1Code.mmCoins}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#mmCommodity
 * ATMMediaType1Code.mmCommodity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#mmCoupons
 * ATMMediaType1Code.mmCoupons}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#mmNotes
 * ATMMediaType1Code.mmNotes}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#mmStamps
 * ATMMediaType1Code.mmStamps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code#mmUndetermined
 * ATMMediaType1Code.mmUndetermined}</li>
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
 * "ATMMediaType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of media inside an ATM cassette."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
 * ATMMediaType2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ATMMediaType1Code extends ATMMediaTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cards"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#mmCards
	 * ATMMediaType2Code.mmCards}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCards = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cards";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.mmCards);
			owner_lazy = () -> ATMMediaType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coins"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#mmCoins
	 * ATMMediaType2Code.mmCoins}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCoins = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coins";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.mmCoins);
			owner_lazy = () -> ATMMediaType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#mmCommodity
	 * ATMMediaType2Code.mmCommodity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCommodity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.mmCommodity);
			owner_lazy = () -> ATMMediaType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coupons"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#mmCoupons
	 * ATMMediaType2Code.mmCoupons}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCoupons = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coupons";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.mmCoupons);
			owner_lazy = () -> ATMMediaType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notes"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#mmNotes
	 * ATMMediaType2Code.mmNotes}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotes = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notes";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.mmNotes);
			owner_lazy = () -> ATMMediaType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stamps"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#mmStamps
	 * ATMMediaType2Code.mmStamps}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStamps = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stamps";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.mmStamps);
			owner_lazy = () -> ATMMediaType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undetermined"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code#mmUndetermined
	 * ATMMediaType2Code.mmUndetermined}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUndetermined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undetermined";
			nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.mmUndetermined);
			owner_lazy = () -> ATMMediaType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMMediaType1Code";
				definition = "Type of media inside an ATM cassette.";
				nextVersions_lazy = () -> Arrays.asList(ATMMediaType2Code.mmObject());
				code_lazy = () -> Arrays.asList(ATMMediaType1Code.mmCards, ATMMediaType1Code.mmCoins, ATMMediaType1Code.mmCommodity, ATMMediaType1Code.mmCoupons, ATMMediaType1Code.mmNotes, ATMMediaType1Code.mmStamps,
						ATMMediaType1Code.mmUndetermined);
				trace_lazy = () -> ATMMediaTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}