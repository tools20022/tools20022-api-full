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
 * Identifies the status of the confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode#Mismatched
 * TradeConfirmationStatusCode.Mismatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode#SelfConfirmedAndCouterpartyNotConfirmed
 * TradeConfirmationStatusCode.SelfConfirmedAndCouterpartyNotConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode#Confirmed
 * TradeConfirmationStatusCode.Confirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode#SelfNotConfirmedAndCouterpartyConfirmed
 * TradeConfirmationStatusCode.SelfNotConfirmedAndCouterpartyConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode#SelfNotConfirmedAndCouterpartyNotConfirmed
 * TradeConfirmationStatusCode.SelfNotConfirmedAndCouterpartyNotConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode#Unconfirmed
 * TradeConfirmationStatusCode.Unconfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode#EmergencyConfirmed
 * TradeConfirmationStatusCode.EmergencyConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode#Disaccord
 * TradeConfirmationStatusCode.Disaccord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode#AllStatus
 * TradeConfirmationStatusCode.AllStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
 * TradeConfirmationStatus1Code}</li>
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
 * "TradeConfirmationStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the status of the confirmation."</li>
 * </ul>
 */
public class TradeConfirmationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade information between Central Matching Utility(analogous to virtual
	 * matching utility) and the trading member is mismatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode
	 * TradeConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mismatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade information between Central Matching Utility(analogous to virtual matching utility) and the trading member is mismatched."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Mismatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mismatched";
			definition = "Trade information between Central Matching Utility(analogous to virtual matching utility) and the trading member is mismatched.";
			owner_lazy = () -> TradeConfirmationStatusCode.mmObject();
			codeName = "MISM";
		}
	};
	/**
	 * Home party has confirmed, but couterparty is unrecognized.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode
	 * TradeConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfConfirmedAndCouterpartyNotConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Home party has confirmed, but couterparty is unrecognized."</li>
	 * </ul>
	 */
	public static final MMCode SelfConfirmedAndCouterpartyNotConfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfConfirmedAndCouterpartyNotConfirmed";
			definition = "Home party has confirmed, but couterparty is unrecognized.";
			owner_lazy = () -> TradeConfirmationStatusCode.mmObject();
			codeName = "SCCN";
		}
	};
	/**
	 * Trades are confirmed by Central Matching Utility (analogous to virtual
	 * matching utility).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode
	 * TradeConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trades are confirmed by Central Matching Utility (analogous to virtual matching utility)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Confirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmed";
			definition = "Trades are confirmed by Central Matching Utility (analogous to virtual matching utility).";
			owner_lazy = () -> TradeConfirmationStatusCode.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * Home party has not confirmed, but couterparty is recognized.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode
	 * TradeConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SNCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfNotConfirmedAndCouterpartyConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Home party has not confirmed, but couterparty is recognized."</li>
	 * </ul>
	 */
	public static final MMCode SelfNotConfirmedAndCouterpartyConfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfNotConfirmedAndCouterpartyConfirmed";
			definition = "Home party has not confirmed, but couterparty is recognized.";
			owner_lazy = () -> TradeConfirmationStatusCode.mmObject();
			codeName = "SNCC";
		}
	};
	/**
	 * Both the two parties are not confirmed
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode
	 * TradeConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SNCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfNotConfirmedAndCouterpartyNotConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Both the two parties are not confirmed"</li>
	 * </ul>
	 */
	public static final MMCode SelfNotConfirmedAndCouterpartyNotConfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfNotConfirmedAndCouterpartyNotConfirmed";
			definition = "Both the two parties are not confirmed";
			owner_lazy = () -> TradeConfirmationStatusCode.mmObject();
			codeName = "SNCN";
		}
	};
	/**
	 * Trades are not confirmed by Central Matching Utility(analogous to virtual
	 * matching utility).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode
	 * TradeConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unconfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trades are not confirmed by Central Matching Utility(analogous to virtual matching utility)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Unconfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unconfirmed";
			definition = "Trades are not confirmed by Central Matching Utility(analogous to virtual matching utility).";
			owner_lazy = () -> TradeConfirmationStatusCode.mmObject();
			codeName = "UNCN";
		}
	};
	/**
	 * Central Matching Utility (analogous to virtual matching utility) confirms
	 * trades in contingency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode
	 * TradeConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmergencyConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Central Matching Utility (analogous to virtual matching utility) confirms trades in contingency."
	 * </li>
	 * </ul>
	 */
	public static final MMCode EmergencyConfirmed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmergencyConfirmed";
			definition = "Central Matching Utility (analogous to virtual matching utility) confirms trades in contingency.";
			owner_lazy = () -> TradeConfirmationStatusCode.mmObject();
			codeName = "EMCN";
		}
	};
	/**
	 * Trade information of the both trading member is unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode
	 * TradeConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disaccord"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade information of the both trading member is unmatched."</li>
	 * </ul>
	 */
	public static final MMCode Disaccord = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disaccord";
			definition = "Trade information of the both trading member is unmatched.";
			owner_lazy = () -> TradeConfirmationStatusCode.mmObject();
			codeName = "DISA";
		}
	};
	/**
	 * All current status of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode
	 * TradeConfirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All current status of the trade."</li>
	 * </ul>
	 */
	public static final MMCode AllStatus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllStatus";
			definition = "All current status of the trade.";
			owner_lazy = () -> TradeConfirmationStatusCode.mmObject();
			codeName = "ALST";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeConfirmationStatusCode";
				definition = "Identifies the status of the confirmation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeConfirmationStatusCode.Mismatched, com.tools20022.repository.codeset.TradeConfirmationStatusCode.SelfConfirmedAndCouterpartyNotConfirmed,
						com.tools20022.repository.codeset.TradeConfirmationStatusCode.Confirmed, com.tools20022.repository.codeset.TradeConfirmationStatusCode.SelfNotConfirmedAndCouterpartyConfirmed,
						com.tools20022.repository.codeset.TradeConfirmationStatusCode.SelfNotConfirmedAndCouterpartyNotConfirmed, com.tools20022.repository.codeset.TradeConfirmationStatusCode.Unconfirmed,
						com.tools20022.repository.codeset.TradeConfirmationStatusCode.EmergencyConfirmed, com.tools20022.repository.codeset.TradeConfirmationStatusCode.Disaccord,
						com.tools20022.repository.codeset.TradeConfirmationStatusCode.AllStatus);
				derivation_lazy = () -> Arrays.asList(TradeConfirmationStatus1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}