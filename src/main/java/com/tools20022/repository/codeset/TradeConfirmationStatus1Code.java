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
import com.tools20022.repository.codeset.TradeConfirmationStatusCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the status of the confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode
 * TradeConfirmationStatusCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#mmAllStatus
 * TradeConfirmationStatus1Code.mmAllStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#mmConfirmed
 * TradeConfirmationStatus1Code.mmConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#mmDisaccord
 * TradeConfirmationStatus1Code.mmDisaccord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#mmEmergencyConfirmed
 * TradeConfirmationStatus1Code.mmEmergencyConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#mmMismatched
 * TradeConfirmationStatus1Code.mmMismatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#mmSelfConfirmedAndCouterpartyNotConfirmed
 * TradeConfirmationStatus1Code.mmSelfConfirmedAndCouterpartyNotConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#mmSelfNotConfirmedAndCouterpartyConfirmed
 * TradeConfirmationStatus1Code.mmSelfNotConfirmedAndCouterpartyConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#mmSelfNotConfirmedAndCouterpartyNotConfirmed
 * TradeConfirmationStatus1Code.mmSelfNotConfirmedAndCouterpartyNotConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#mmUnconfirmed
 * TradeConfirmationStatus1Code.mmUnconfirmed}</li>
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
 * "TradeConfirmationStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the status of the confirmation."</li>
 * </ul>
 */
public class TradeConfirmationStatus1Code extends TradeConfirmationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllStatus"</li>
	 * </ul>
	 */
	public static final MMCode mmAllStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllStatus";
			owner_lazy = () -> TradeConfirmationStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * </ul>
	 */
	public static final MMCode mmConfirmed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmed";
			owner_lazy = () -> TradeConfirmationStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disaccord"</li>
	 * </ul>
	 */
	public static final MMCode mmDisaccord = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disaccord";
			owner_lazy = () -> TradeConfirmationStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmergencyConfirmed"</li>
	 * </ul>
	 */
	public static final MMCode mmEmergencyConfirmed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmergencyConfirmed";
			owner_lazy = () -> TradeConfirmationStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mismatched"</li>
	 * </ul>
	 */
	public static final MMCode mmMismatched = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mismatched";
			owner_lazy = () -> TradeConfirmationStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfConfirmedAndCouterpartyNotConfirmed"</li>
	 * </ul>
	 */
	public static final MMCode mmSelfConfirmedAndCouterpartyNotConfirmed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfConfirmedAndCouterpartyNotConfirmed";
			owner_lazy = () -> TradeConfirmationStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfNotConfirmedAndCouterpartyConfirmed"</li>
	 * </ul>
	 */
	public static final MMCode mmSelfNotConfirmedAndCouterpartyConfirmed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfNotConfirmedAndCouterpartyConfirmed";
			owner_lazy = () -> TradeConfirmationStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfNotConfirmedAndCouterpartyNotConfirmed"</li>
	 * </ul>
	 */
	public static final MMCode mmSelfNotConfirmedAndCouterpartyNotConfirmed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfNotConfirmedAndCouterpartyNotConfirmed";
			owner_lazy = () -> TradeConfirmationStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unconfirmed"</li>
	 * </ul>
	 */
	public static final MMCode mmUnconfirmed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unconfirmed";
			owner_lazy = () -> TradeConfirmationStatus1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeConfirmationStatus1Code";
				definition = "Identifies the status of the confirmation.";
				code_lazy = () -> Arrays.asList(TradeConfirmationStatus1Code.mmAllStatus, TradeConfirmationStatus1Code.mmConfirmed, TradeConfirmationStatus1Code.mmDisaccord, TradeConfirmationStatus1Code.mmEmergencyConfirmed,
						TradeConfirmationStatus1Code.mmMismatched, TradeConfirmationStatus1Code.mmSelfConfirmedAndCouterpartyNotConfirmed, TradeConfirmationStatus1Code.mmSelfNotConfirmedAndCouterpartyConfirmed,
						TradeConfirmationStatus1Code.mmSelfNotConfirmedAndCouterpartyNotConfirmed, TradeConfirmationStatus1Code.mmUnconfirmed);
				trace_lazy = () -> TradeConfirmationStatusCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}