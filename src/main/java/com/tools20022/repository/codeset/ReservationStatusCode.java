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
 * Specifies the current status of a limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode#mmEnabled
 * ReservationStatusCode.mmEnabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode#mmDisabled
 * ReservationStatusCode.mmDisabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode#mmDeleted
 * ReservationStatusCode.mmDeleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode#mmRequested
 * ReservationStatusCode.mmRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode#mmBlocked
 * ReservationStatusCode.mmBlocked}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ReservationStatus1Code
 * ReservationStatus1Code}</li>
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
 * <li>"ENAB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReservationStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the current status of a limit."</li>
 * </ul>
 */
public class ReservationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reservation is currently in effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode
	 * ReservationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENAB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reservation is currently in effect."</li>
	 * </ul>
	 */
	public static final MMCode mmEnabled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enabled";
			definition = "Reservation is currently in effect.";
			owner_lazy = () -> ReservationStatusCode.mmObject();
			codeName = "ENAB";
		}
	};
	/**
	 * Reservation is not currently in effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode
	 * ReservationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reservation is not currently in effect.\n"</li>
	 * </ul>
	 */
	public static final MMCode mmDisabled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disabled";
			definition = "Reservation is not currently in effect.\n";
			owner_lazy = () -> ReservationStatusCode.mmObject();
			codeName = "DISA";
		}
	};
	/**
	 * Reservation has been deleted or suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode
	 * ReservationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reservation has been deleted or suspended."</li>
	 * </ul>
	 */
	public static final MMCode mmDeleted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deleted";
			definition = "Reservation has been deleted or suspended.";
			owner_lazy = () -> ReservationStatusCode.mmObject();
			codeName = "DELD";
		}
	};
	/**
	 * Reservation has been asked for and is not yet enabled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode
	 * ReservationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REQD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Requested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reservation has been asked for and is not yet enabled.\n"</li>
	 * </ul>
	 */
	public static final MMCode mmRequested = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Requested";
			definition = "Reservation has been asked for and is not yet enabled.\n";
			owner_lazy = () -> ReservationStatusCode.mmObject();
			codeName = "REQD";
		}
	};
	/**
	 * Reservation is blocked or frozen due to external circumstances such as a
	 * court order, death of beneficiary or account owner, or bankruptcy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationStatusCode
	 * ReservationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLKD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reservation is blocked or frozen due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBlocked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			definition = "Reservation is blocked or frozen due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy.";
			owner_lazy = () -> ReservationStatusCode.mmObject();
			codeName = "BLKD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ENAB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReservationStatusCode";
				definition = "Specifies the current status of a limit.";
				code_lazy = () -> Arrays.asList(ReservationStatusCode.mmEnabled, ReservationStatusCode.mmDisabled, ReservationStatusCode.mmDeleted, ReservationStatusCode.mmRequested, ReservationStatusCode.mmBlocked);
				derivation_lazy = () -> Arrays.asList(ReservationStatus1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}